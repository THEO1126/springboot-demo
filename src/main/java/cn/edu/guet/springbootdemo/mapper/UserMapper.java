package cn.edu.guet.springbootdemo.mapper;


import cn.edu.guet.springbootdemo.bean.Permission;
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
    User login(User user);
    boolean checkUsername(String username);
    List<Permission> getPermissionByUserId(int userId);
}
