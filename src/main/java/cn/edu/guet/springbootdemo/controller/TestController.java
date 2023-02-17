package cn.edu.guet.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 李冰冰
 * @Date 2023/02/16
 * @Version 17.0.5
 */

@Controller
public class TestController {
    //    第一个方法
    @RequestMapping(value = "/hello/one")
    @ResponseBody
    public String One(){
        return "第一个方法";
    }
    //    第二个方法
    @RequestMapping(value = "/user/go")
    @ResponseBody
    public String Two(){
        return "第二个方法";
    }
}
