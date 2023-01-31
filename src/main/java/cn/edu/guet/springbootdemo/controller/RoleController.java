package cn.edu.guet.springbootdemo.controller;

import cn.edu.guet.springbootdemo.bean.Result;
import cn.edu.guet.springbootdemo.bean.Role;
import cn.edu.guet.springbootdemo.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/01/06
 * @Version 17.0.5
 */

@RestController
public class RoleController {
    private RoleService roleService;

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping("/getRoleList")
    public List<Role> getRoleList(){
        List<Role> roleList=null;
        roleList=roleService.getRoleList();
        return roleList;
    }

}
