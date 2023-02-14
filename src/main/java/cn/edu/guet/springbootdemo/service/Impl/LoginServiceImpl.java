package cn.edu.guet.springbootdemo.service.Impl;

import cn.edu.guet.springbootdemo.bean.LoginVo;
import cn.edu.guet.springbootdemo.mapper.LoginMapper;
import cn.edu.guet.springbootdemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 李冰冰
 * @Date 2023/02/14
 * @Version 17.0.5
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public LoginVo login(LoginVo loginVo) {
        return loginMapper.login(loginVo);
    }

    @Override
    public String getSaltByName(String username) {
        return loginMapper.getSaltByName(username);
    }
}
