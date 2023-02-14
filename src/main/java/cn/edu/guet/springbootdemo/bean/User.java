package cn.edu.guet.springbootdemo.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * @Author 李冰冰
 * @Date 2023/1/30
 * @Version 1.0
 */

public class User {
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private int userId;
    private String username; // 账号 对应 数据库的name
    private String password;
    private String nickName; // 姓名 nick_name
    private String mobile; // 电话
    private String identity; // 身份证
    private String homeAddress; // 家庭住址 home_address
    private Date onboardingTime ; // 入职时间 onboarding_time
    private Date departureTime; // 离职时间 departure_time
    private String status; // 状态  在职或离职
    private List<Role> roleList;
    private int age;
    Date createTime;
    String createBy;
    Date lastUpdateTime;
    String lastUpdateBy;
    String salt;

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public User(int userId, String username, String password, String nickName, String mobile, String identity, String homeAddress, Date onboardingTime, Date departureTime, String status, List<Role> roleList, int age, Date createTime, String createBy, Date lastUpdateTime, String lastUpdateBy, String salt) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.nickName = nickName;
        this.mobile = mobile;
        this.identity = identity;
        this.homeAddress = homeAddress;
        this.onboardingTime = onboardingTime;
        this.departureTime = departureTime;
        this.status = status;
        this.roleList = roleList;
        this.age = age;
        this.createTime = createTime;
        this.createBy = createBy;
        this.lastUpdateTime = lastUpdateTime;
        this.lastUpdateBy = lastUpdateBy;
        this.salt = salt;
    }

    public User(int userId, String username, String password, String nickName, String mobile, String identity, String homeAddress, Date onboardingTime, Date departureTime, String status, List<Role> roleList, int age, Date createTime, String createBy, Date lastUpdateTime, String lastUpdateBy, boolean rememberMe) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.nickName = nickName;
        this.mobile = mobile;
        this.identity = identity;
        this.homeAddress = homeAddress;
        this.onboardingTime = onboardingTime;
        this.departureTime = departureTime;
        this.status = status;
        this.roleList = roleList;
        this.age = age;
        this.createTime = createTime;
        this.createBy = createBy;
        this.lastUpdateTime = lastUpdateTime;
        this.lastUpdateBy = lastUpdateBy;
    }



    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public User(int userId, String username, String password, String nickName, String mobile, String identity, String homeAddress, Date onboardingTime, Date departureTime, String status, List<Role> roleList, int age, Date createTime, String createBy, Date lastUpdateTime, String lastUpdateBy) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.nickName = nickName;
        this.mobile = mobile;
        this.identity = identity;
        this.homeAddress = homeAddress;
        this.onboardingTime = onboardingTime;
        this.departureTime = departureTime;
        this.status = status;
        this.roleList = roleList;
        this.age = age;
        this.createTime = createTime;
        this.createBy = createBy;
        this.lastUpdateTime = lastUpdateTime;
        this.lastUpdateBy = lastUpdateBy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(int userId, String username, String password, String nickName, String mobile, String identity, String homeAddress, Date onboardingTime, Date departureTime, String status, List<Role> roleList, int age) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.nickName = nickName;
        this.mobile = mobile;
        this.identity = identity;
        this.homeAddress = homeAddress;
        this.onboardingTime = onboardingTime;
        this.departureTime = departureTime;
        this.status = status;
        this.roleList = roleList;
        this.age = age;
    }

    public User(int userId, String username, String password, String nickName, String mobile, String identity, String homeAddress, Date onboardingTime, Date departureTime, String status, List<Role> roleList) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.nickName = nickName;
        this.mobile = mobile;
        this.identity = identity;
        this.homeAddress = homeAddress;
        this.onboardingTime = onboardingTime;
        this.departureTime = departureTime;
        this.status = status;
        this.roleList = roleList;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Date getOnboardingTime() {
        return onboardingTime;
    }

    public void setOnboardingTime(Date onboardingTime) {
        this.onboardingTime = onboardingTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User() {
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

    public static void main(String[] args) {
        //获取日期
        //导 import java.util.Date; 下的包
        Date date = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy, h:m:s aa", Locale.ENGLISH);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = dateFormat.parse("Sep 1, 2021, 6:07:52 PM");
            System.out.println(sdf.format(date1));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
