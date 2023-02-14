package cn.edu.guet.springbootdemo.service;

import cn.edu.guet.springbootdemo.bean.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getMenu();
    List<Menu> getMenuById(int id);
    void addMenu(Menu menu);
    void updateMenu(Menu menu);
    void deleteMenuById(int id);
}
