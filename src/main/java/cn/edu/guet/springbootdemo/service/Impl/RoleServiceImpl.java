package cn.edu.guet.springbootdemo.service.Impl;

import cn.edu.guet.springbootdemo.bean.Menu;
import cn.edu.guet.springbootdemo.bean.Role;
import cn.edu.guet.springbootdemo.mapper.RoleMapper;
import cn.edu.guet.springbootdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/01/06
 * @Version 17.0.5
 */

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getRoleNameList() {
        return roleMapper.getRoleNameList();
    }

    @Override
    public List<Role> getRoleList() {
        return roleMapper.getRoleList();
    }

    @Override
    public void insertRole(Role role) {
        roleMapper.insertRole(role);
    }

    @Override
    public void updateRole(Role role) {
        roleMapper.updateRole(role);
    }

    @Override
    public void deleteRoleById(int roleId) {
        roleMapper.deleteRoleById(roleId);
    }

    @Override
    public List<Role> searchRoleByName(String roleName) {
        return roleMapper.searchRoleByName(roleName);
    }

    @Override
    public void insertRoleMenu(int roleId, List<Menu> menuList) {
        roleMapper.insertRoleMenu(roleId,menuList);
    }

    @Override
    public void deleteRoleMenu(int roleId) {
        roleMapper.deleteRoleMenu(roleId);
    }
}
