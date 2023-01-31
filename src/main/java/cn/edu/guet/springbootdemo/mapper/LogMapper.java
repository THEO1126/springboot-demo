package cn.edu.guet.springbootdemo.mapper;

import cn.edu.guet.springbootdemo.bean.Log;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author liwei
 * @Date 2023/1/10 11:28
 * @Version 1.0
 */
@Mapper
public interface LogMapper {
    void saveLog(Log log);
}
