package cn.edu.guet.springbootdemo.controller;


import cn.edu.guet.springbootdemo.bean.Permission;
import cn.edu.guet.springbootdemo.bean.Result;
import cn.edu.guet.springbootdemo.bean.User;
import cn.edu.guet.springbootdemo.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2022/1/6 15:00
 * @Version 1.0
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/checkUsername")
    public Result checkUsername(String username){
        boolean result=userService.checkUsername(username);
        if(result){
            return new Result(200, true);
        }else{
            return new Result(201,false);
        }
    }

    @GetMapping("/getPermissionByUserId")
    public Result getPermissionByUserId(int userId){
        List<Permission> permissionList = null;
        permissionList = userService.getPermissionByUserId(userId);
        List<Permission> childPermissionList = new ArrayList<>();
        // 二级菜单
        for (Permission child : permissionList){
            if (child.getParentId()!=0&&child.getType()==1){
                System.out.println("二级菜单名字"+child.getName());
                childPermissionList.add(child);
            }
        }
        for (Permission permission:permissionList){
            for (Permission childPer:childPermissionList){
                if (childPer.getParentId()==permission.getPerId()){
                    permission.getChilds().add(childPer);
                }
            }
        }
        List<Permission> finalPermissionList = new ArrayList<>();
        for (Permission permission:permissionList){
            if (permission.getParentId()==0){
                finalPermissionList.add(permission);
            }
        }
        return new Result(200,"获取权限成功",finalPermissionList);
    }

    @GetMapping("/getUserList")
    public Result getUserList(){
        List<User> userList=userService.getUserList();
        if (userList!=null) {
            return new Result(200, "成功", userList);
        }else{
            return new Result(201,"失败",null);
        }
    }

    @RequestMapping("/getUserListTotalPage")
    public Result getUserListTotalPage(){
        int userListTotalPage=userService.getUserListTotalPage();
        return new Result(200, "成功", userListTotalPage);
    }

    @RequestMapping("/getUserListByPage")
    public Result getUserListByPage(int currentPage, int pageSize){
        int fromIndex=(currentPage-1)*pageSize;
        List<User> userListByPage=userService.getUserListByPage(fromIndex,pageSize);
        if (userListByPage!=null) {
            return new Result(200, "成功", userListByPage);
        }else{
            return new Result(201,"失败",null);
        }
    }
}
