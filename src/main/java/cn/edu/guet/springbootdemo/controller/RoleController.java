package cn.edu.guet.springbootdemo.controller;

import cn.edu.guet.springbootdemo.bean.Menu;
import cn.edu.guet.springbootdemo.bean.Result;
import cn.edu.guet.springbootdemo.bean.Role;
import cn.edu.guet.springbootdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Autowired
    private RoleService roleService;

    @RequestMapping("/getRoleNameList")
    public List<Role> getRoleNameList(){
        List<Role> roleNameList=null;
        roleNameList=roleService.getRoleNameList();
        return roleNameList;
    }

    @RequestMapping("/getRoleList")
    public Result getRoleList(){
        List<Role> roleList=null;
        roleList=roleService.getRoleList();
        if(roleList!=null){
            return new Result(200,"成功",roleList);
        }else{
            return new Result(201,"失败",null);
        }
    }


    @RequestMapping("/insertRole")
    public Result insertRole(@RequestBody Role role) {
        roleService.insertRole(role);
        return new Result(200,"插入成功",null);
    }

    @RequestMapping("/updateRole")
    public Result updateRole(@RequestBody Role role) {
        roleService.updateRole(role);
        return new Result(200,"更新成功",null);
    }

    @RequestMapping("/deleteRoleById")
    public Result deleteRoleById(int roleId) {
        roleService.deleteRoleById(roleId);
        return new Result(200,"删除成功",null);
    }

    @RequestMapping("/searchRoleByName")
    public Result searchRoleByName(String roleName){
        List<Role> roleList=roleService.searchRoleByName(roleName);
        if(roleList!=null) {
            return new Result(200, "查询成功", roleList);
        }else{
            return new Result(201, "没有更多的数据", null);
        }
    }

    @RequestMapping("/insertRoleMenu")
    public Result insertRoleMenu(@RequestBody Role role) {
        roleService.deleteRoleMenu(role.getRoleId());
        if(role.getMenuList().size()!=0){
            roleService.insertRoleMenu(role.getRoleId(),role.getMenuList());
        }
        return new Result(200,"分配权限成功",null);
    }

}
