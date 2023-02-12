package cn.edu.guet.springbootdemo.service;


import cn.edu.guet.springbootdemo.bean.Permission;
import cn.edu.guet.springbootdemo.bean.Role;
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

    List<User> getUserList();// 员工列表

    List<User> getUserListByPage(int fromIndex,int pageSize); // 员工列表的分页查询
    int getUserListTotalPage(); // 获取员工列表总的条数

    int delectUser(int userId);// 删除员工和其对应的角色

    boolean insertUser(User userInfo);

    boolean updateUser(User userInfo);

    List<User> searchUserList(String name,String nickName,int fromIndex,int pageSize);
    int searchUserListTotalPage(String name,String nickName);
}
