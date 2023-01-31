package cn.edu.guet.springbootdemo.bean;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/1/30
 * @Version 1.0
 */
public class Role {

    private int roleId;
    private String roleName;
    private List<Permission> permissionList;

    public Role() {
    }

    public Role(int roleId, String roleName, List<Permission> permissionList) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.permissionList = permissionList;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }
}
