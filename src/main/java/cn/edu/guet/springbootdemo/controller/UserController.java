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
            return new Result(100, true);
        }else{
            return new Result(101,false);
        }

    }

    @RequestMapping("/getPermissionByUserId")
    public Result getPermissionByUserId(int userId){
        List<Permission> permissionList = null;
        Gson gson =new Gson();
        permissionList = userService.getPermissionByUserId(userId);
        System.out.println(permissionList);
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

}
