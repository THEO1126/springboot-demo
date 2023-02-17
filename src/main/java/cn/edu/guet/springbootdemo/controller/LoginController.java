package cn.edu.guet.springbootdemo.controller;

import cn.edu.guet.springbootdemo.bean.LoginVo;
import cn.edu.guet.springbootdemo.bean.Result;
import cn.edu.guet.springbootdemo.bean.User;
import cn.edu.guet.springbootdemo.service.LoginService;
import cn.edu.guet.springbootdemo.service.UserService;
import cn.edu.guet.springbootdemo.util.MD5Utils;
import cn.edu.guet.springbootdemo.util.TokenUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.catalina.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 李冰冰
 * @Date 2023/01/31
 * @Version 17.0.5
 */

@RestController

public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test(@RequestBody LoginVo loginInfo) throws JsonProcessingException {
        HashMap<String,Object> hs=new HashMap<>();
        hs.put("data","data");
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.writeValueAsString(hs);
    }

    @RequestMapping("/admin/login")
    @ResponseBody
    public Result login(@RequestBody LoginVo loginInfo){
        try {
            String username=loginInfo.getUsername();
            String rawPass=loginInfo.getPassword();
            String salt=loginService.getSaltByName(username);
            LoginVo result=null;
            LoginVo loginVo=new LoginVo();
            if(salt!=null){
                // 登入加密验证
                MD5Utils encoderMd5 = new MD5Utils(salt);
                String encPass= encoderMd5.encode(rawPass);
                loginVo.setUsername(loginInfo.getUsername());
                loginVo.setPassword(encPass);
                result=loginService.login(loginVo);
            }
            if (result != null) {
                String loginToken= TokenUtil.sign(loginVo);
                result.setLoginToken(loginToken);
                System.out.println("loginToken:"+loginToken);
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
