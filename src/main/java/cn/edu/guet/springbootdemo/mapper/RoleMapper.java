package cn.edu.guet.springbootdemo.mapper;


import cn.edu.guet.springbootdemo.bean.Menu;
import cn.edu.guet.springbootdemo.bean.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/01/06
 * @Version 17.0.5
 */
@Mapper
public interface RoleMapper {
    List<Role> getRoleNameList(); // 角色的名称列表

    List<Role> getRoleList();

    void insertRole(Role role);
    void updateRole(Role role);
    void deleteRoleById(int roleId);
    List<Role> searchRoleByName(String roleName);
    void insertRoleMenu(int roleId, List<Menu> menuList);
    void deleteRoleMenu(int roleId);
}
