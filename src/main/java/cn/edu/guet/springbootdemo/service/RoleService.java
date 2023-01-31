package cn.edu.guet.springbootdemo.service;


import cn.edu.guet.springbootdemo.bean.Role;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/01/06
 * @Version 17.0.5
 */
public interface RoleService {
    List<Role> getRoleList();

//    boolean insertRole(String roleName,List<Integer> pIdList); // 插入用户
//    boolean checkRolename(String roleName); // 检查角色名是否存在
//    List<Role> searchRoleList(String roleName);
}
