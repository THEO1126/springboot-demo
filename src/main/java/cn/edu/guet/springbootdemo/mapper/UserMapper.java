package cn.edu.guet.springbootdemo.mapper;


import cn.edu.guet.springbootdemo.bean.Permission;
import cn.edu.guet.springbootdemo.bean.Role;
import cn.edu.guet.springbootdemo.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/01/06
 * @Version 17.0.5
 */

@Mapper
public interface UserMapper {

    boolean checkUsername(String username);
    List<Permission> getPermissionByUserId(int userId);
    List<User> getUserList();
    List<User> getUserListByPage(int fromIndex,int pageSize);
    int getUserListTotalPage();
    int delectUser(int userId);

    int insertUser(User user);
    int insertUserRole(String username,List<Role> roleList);

    int updateUser(User userInfo);
    int deleteUserRole(int userId);

    List<User> searchUserList(String name,String nickName,int fromIndex,int pageSize);
    int searchUserListTotalPage(String name,String nickName);

    List<User> getUserByUserId(int userId);
}
