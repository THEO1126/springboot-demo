package cn.edu.guet.springbootdemo.controller;

import cn.edu.guet.springbootdemo.bean.Permission;
import cn.edu.guet.springbootdemo.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/01/07
 * @Version 17.0.5
 */

@RestController
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/getPermissionList")
    public List<Permission> getPermissionList(){
        List<Permission> permissionList=null;
        permissionList=permissionService.getPermissionList();
        return permissionList;
    }

//     // 根据id获取权限
//    @RequestMapping("/getPermissionByUserId")
//    public List<Permission> getPermissionByUserId(@RequestBody int userId){
//        System.out.println(".../getPermissionByUserId");
//        List<Permission> permissionList = null;
//        permissionList = permissionService.getPermissionByUserId(userId);
//        return permissionList;
//    }
}
