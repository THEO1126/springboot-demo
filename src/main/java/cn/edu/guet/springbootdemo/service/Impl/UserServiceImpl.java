package cn.edu.guet.springbootdemo.service.Impl;

import cn.edu.guet.springbootdemo.bean.Permission;
import cn.edu.guet.springbootdemo.bean.User;
import cn.edu.guet.springbootdemo.mapper.UserMapper;
import cn.edu.guet.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/01/06
 * @Version 17.0.5
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public boolean checkUsername(String username) {
        boolean result=userMapper.checkUsername(username);
        return result;
    }

    @Override
    public List<Permission> getPermissionByUserId(int userId) {
        return userMapper.getPermissionByUserId(userId);
    }


}
