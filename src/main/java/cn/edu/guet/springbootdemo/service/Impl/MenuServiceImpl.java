package cn.edu.guet.springbootdemo.service.Impl;

import cn.edu.guet.springbootdemo.bean.Menu;
import cn.edu.guet.springbootdemo.mapper.MenuMapper;
import cn.edu.guet.springbootdemo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 钟荣钊
 * @Date 2023/02/05
 * @Version 1.0
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getMenu() {
        return menuMapper.getAllMenu();
    }

    @Override
    public List<Menu> getMenuById(int id) {
        return menuMapper.getMenuById(id);
    }

    @Override
    public void addMenu(Menu menu) {
        menuMapper.addMenu(menu);
    }

    @Override
    public void updateMenu(Menu menu) {
        menuMapper.updateMenu(menu);
    }

    @Override
    public void deleteMenuById(int id) {
        menuMapper.deleteMenuById(id);
    }
}
