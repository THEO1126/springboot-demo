package cn.edu.guet.springbootdemo.service;


import cn.edu.guet.springbootdemo.bean.Permission;
import cn.edu.guet.springbootdemo.bean.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/01/06
 * @Version 17.0.5
 */

public interface UserService {
    User login(User user); // 登入
    boolean checkUsername(String username);// 检查用户名
    List<Permission> getPermissionByUserId(int userId); // 获取权限菜单

//    List<User> getUserList();// 用户列表
//
//    boolean insertUser(String username, String password, int roleId);//插入用户
//
//    boolean deleteUser(int userId) throws SQLException;// 删除用户
//
//    List<User> searchUserList(String username,int roleId); // 查询
}
