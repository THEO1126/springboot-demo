package cn.edu.guet.springbootdemo.mapper;

import cn.edu.guet.springbootdemo.bean.LoginVo;
import cn.edu.guet.springbootdemo.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 李冰冰
 * @Date 2023/02/14
 * @Version 17.0.5
 */

@Mapper
public interface LoginMapper {
    LoginVo login(LoginVo loginVo); // 登入
    String getSaltByName(String username);
}
