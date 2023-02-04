package cn.edu.guet.springbootdemo.service.Impl;

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
}
