package cn.edu.guet.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

/* 无论在配置文件中写那个端口号总是自动跳转到一个login页面
     添加了spring security依赖，SpringSecurity的依赖或SecurityAutoConfiguration
     是Spring Boot提供的安全自动配置类(也就是说它自动集成了SpringSecurity)；
*/

@SpringBootApplication(exclude = {JacksonAutoConfiguration.class})
//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
