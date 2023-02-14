package cn.edu.guet.springbootdemo.bean;

/**
 * @Author 李冰冰
 * @Date 2023/02/14
 * @Version 17.0.5
 */

public class LoginVo {
    private int userId;
    private String username; // 账号 对应 数据库的name
    private String password;
    private String salt;
    private boolean rememberMe;

    public LoginVo(int userId, String username, String password, String salt, boolean rememberMe) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.rememberMe = rememberMe;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public LoginVo() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public LoginVo(int userId, String username, String password, String salt) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.salt = salt;
    }
}
