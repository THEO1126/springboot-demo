package cn.edu.guet.springbootdemo.mapper;

import cn.edu.guet.springbootdemo.bean.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/01/07
 * @Version 17.0.5
 */
@Mapper
public interface PermissionMapper {
    List<Permission> getPermissionList();
    List<Permission> getPermissionByUserId(int userId);
}
