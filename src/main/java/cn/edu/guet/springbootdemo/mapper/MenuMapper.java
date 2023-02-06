package cn.edu.guet.springbootdemo.mapper;

import cn.edu.guet.springbootdemo.bean.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> getAllMenu();
    List<Menu> getMenuById(int id);
    void addMenu(Menu menu);
    void updateMenu(Menu menu);
    void deleteMenuById(int id);

}
