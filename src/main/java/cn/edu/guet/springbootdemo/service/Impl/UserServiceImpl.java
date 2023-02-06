package cn.edu.guet.springbootdemo.service.Impl;

import cn.edu.guet.springbootdemo.bean.Permission;
import cn.edu.guet.springbootdemo.bean.Role;
import cn.edu.guet.springbootdemo.bean.User;
import cn.edu.guet.springbootdemo.mapper.UserMapper;
import cn.edu.guet.springbootdemo.service.UserService;
import cn.edu.guet.springbootdemo.util.DBUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/01/06
 * @Version 17.0.5
 */
@Service
public class UserServiceImpl implements UserService {
    private SqlSession sqlSession= DBUtils.openSqlSession();
    private UserMapper userMapperInsert=sqlSession.getMapper(UserMapper.class); ;
    private UserMapper userMapperUpdate=sqlSession.getMapper(UserMapper.class); ;
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public boolean checkUsername(String username) {
        boolean result=userMapper.checkUsername(username);
        return result;
    }

    @Override
    public List<Permission> getPermissionByUserId(int userId) {
        return userMapper.getPermissionByUserId(userId);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public List<User> getUserListByPage(int fromIndex, int pageSize) {
        return userMapper.getUserListByPage(fromIndex,pageSize);
    }

    @Override
    public int getUserListTotalPage() {
        return userMapper.getUserListTotalPage();
    }

    @Override
    public int delectUser(int userId) {
        return userMapper.delectUser(userId);
    }

    @Override
    public boolean insertUser(User userInfo) {
        try{
            int result1=userMapperInsert.insertUser(userInfo);
            int result2=userMapperInsert.insertUserRole(userInfo.getUsername(),userInfo.getRoleList());
            sqlSession.commit();
            if(result1>0 && result2>0){
                return true;
            }else {
                sqlSession.rollback();
                System.out.println("回滚");
            }
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            return false;
        }
        return false;
    }

    @Override
    public boolean updateUser(User userInfo) {
        try{
            int result2=userMapperUpdate.deleteUserRole(userInfo.getUserId());
            int result1=userMapperUpdate.updateUser(userInfo);
            int result3=userMapperUpdate.insertUserRole(userInfo.getUsername(),userInfo.getRoleList());
            sqlSession.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            return false;
        }
    }
}
