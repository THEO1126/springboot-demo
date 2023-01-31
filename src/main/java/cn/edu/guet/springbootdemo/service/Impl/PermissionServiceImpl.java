package cn.edu.guet.springbootdemo.service.Impl;

import cn.edu.guet.springbootdemo.bean.Permission;
import cn.edu.guet.springbootdemo.mapper.PermissionMapper;
import cn.edu.guet.springbootdemo.mapper.UserMapper;
import cn.edu.guet.springbootdemo.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/01/07
 * @Version 17.0.5
 */

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> getPermissionList() {
        return permissionMapper.getPermissionList();
    }

    @Override
    public List<Permission> getPermissionByUserId(int userId) {
        return permissionMapper.getPermissionByUserId(userId);
    }
}
