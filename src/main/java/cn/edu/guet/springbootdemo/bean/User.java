package cn.edu.guet.springbootdemo.bean;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/1/30
 * @Version 1.0
 */

public class User {

    private int userId;
    private String username;
    private String password;
    private List<Role> roleList;


    public User() {
    }

    public User(int userId, String username, List<Role> roleList) {
        this.userId = userId;
        this.username = username;
        this.roleList = roleList;
    }


    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
