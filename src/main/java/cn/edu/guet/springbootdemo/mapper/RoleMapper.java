package cn.edu.guet.springbootdemo.mapper;


import cn.edu.guet.springbootdemo.bean.Role;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/01/06
 * @Version 17.0.5
 */
public interface RoleMapper {
    List<Role> getRoleList(); // 角色列表
//    int insertRole(String roleName); // 插入role
//    int insertRolePermission(String roleName,List<Integer> pIdList); // 给role插入权限
//    boolean checkRolename(String roleName); // 检查角色名是否存在
//
//    List<Role> searchRoleList(String roleName);
}
