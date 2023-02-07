package cn.edu.guet.springbootdemo.controller;

import cn.edu.guet.springbootdemo.bean.Menu;
import cn.edu.guet.springbootdemo.bean.Permission;
import cn.edu.guet.springbootdemo.bean.Result;
import cn.edu.guet.springbootdemo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 钟荣钊
 * @Date 2023/02/05
 * @Version 1.0
 */

@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    // lbb
    @RequestMapping("/getAllMenu")
    public Result getAllMenu(){
        List<Menu> menuList = menuService.getMenu();
        if (menuList != null){
            return new Result(200,"菜单查询成功", menuList);
        }else {
            return new Result(201,"菜单查询失败", null);
        }
    }

    @RequestMapping("/getMenuById")
    public Result getMenu(int id){
        List<Menu> menuList = menuService.getMenuById(id);
        if (menuList != null){
            return new Result(200,"菜单查询成功", menuList);
        }else {
            return new Result(201,"菜单查询失败", null);
        }
    }

    @RequestMapping("/insertMenu")
    public Result addMenu(@RequestBody Menu menu){
        try {
            menuService.addMenu(menu);
            return new Result(200,"增加菜单成功", null);
        } catch (Exception e){
            e.printStackTrace();
            return new Result(201,"增加菜单失败", null);
        }
    }

    @RequestMapping("/updateMenu")
    public Result updateMenu(@RequestBody Menu menu){
        try {
            menuService.updateMenu(menu);
            return new Result(200,"更新菜单成功", null);
        } catch (Exception e){
            e.printStackTrace();
            return new Result(201,"更新菜单失败", null);
        }
    }

    @RequestMapping("/deleteMenu")
    public Result deleteMenu(int id){
        try {
            menuService.deleteMenuById(id);
            return new Result(200,"删除菜单成功", null);
        } catch (Exception e){
            return new Result(201,"删除菜单失败", null);
        }
    }
}
