package cn.edu.guet.springbootdemo.service;

import cn.edu.guet.springbootdemo.bean.Permission;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/01/07
 * @Version 17.0.5
 */
public interface PermissionService {
    List<Permission> getPermissionList();

    List<Permission> getPermissionByUserId(int userId);
}
