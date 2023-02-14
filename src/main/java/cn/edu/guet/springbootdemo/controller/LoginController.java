package cn.edu.guet.springbootdemo.controller;

import cn.edu.guet.springbootdemo.bean.LoginVo;
import cn.edu.guet.springbootdemo.bean.Result;
import cn.edu.guet.springbootdemo.bean.User;
import cn.edu.guet.springbootdemo.service.LoginService;
import cn.edu.guet.springbootdemo.service.UserService;
import cn.edu.guet.springbootdemo.util.MD5Utils;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.catalina.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 李冰冰
 * @Date 2023/01/31
 * @Version 17.0.5
 */

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/test")
    public Result test() {
        try {
            System.out.println(".../test");
            return new Result(200, "成功");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return new Result(201, "失败");
        }
    }

    @RequestMapping("/admin/login")
    public Result login(@RequestBody LoginVo loginInfo){
        try {
            String username=loginInfo.getUsername();
            String rawPass=loginInfo.getPassword();
            String salt=loginService.getSaltByName(username);
            LoginVo result=null;
            if(salt!=null){
                // 登入加密验证
                MD5Utils encoderMd5 = new MD5Utils(salt);
                String encPass= encoderMd5.encode(rawPass);
                LoginVo loginVo=new LoginVo();
                loginVo.setUsername(loginInfo.getUsername());
                loginVo.setPassword(encPass);
                result=loginService.login(loginVo);
            }
            if (result != null) {
                System.out.println("登入成功");
                return new Result(200, "登入成功！success",result);
            } else {
                System.out.println("登入失败");
                return new Result(201, "登入失败！error",null);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

}
