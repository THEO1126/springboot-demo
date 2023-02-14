package cn.edu.guet.springbootdemo.service;

import cn.edu.guet.springbootdemo.bean.LoginVo;
import cn.edu.guet.springbootdemo.bean.User;

/**
 * @Author 李冰冰
 * @Date 2023/02/14
 * @Version 17.0.5
 */
public interface LoginService {
    LoginVo login(LoginVo loginVo); // 登入
    String getSaltByName(String username);
}
