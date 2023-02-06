package cn.edu.guet.springbootdemo.mapper;


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
}
