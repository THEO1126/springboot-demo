package cn.edu.guet.springbootdemo;

import cn.edu.guet.springbootdemo.bean.LoginVo;
import cn.edu.guet.springbootdemo.util.TokenUtil;

/**
 * @Author 李冰冰
 * @Date 2023/02/16
 * @Version 17.0.5
 */

public class tokenTest {

    public static void main(String[] args) {
        LoginVo loginVo =new LoginVo();
        loginVo.setUsername("admin");
        loginVo.setPassword("123456");
        String loginToken= TokenUtil.sign(loginVo);
        System.out.println("loginToken:"+loginToken);
        TokenUtil.verify(loginToken);
    }
}
