package cn.edu.guet.springbootdemo.config;

/**
 * @Author 李冰冰
 * @Date 2023/02/15
 * @Version 17.0.5
 * 配置拦截器
 */

import cn.edu.guet.springbootdemo.interceptor.TokenHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;
import org.springframework.web.servlet.config.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * 跨域请求支持
 * token拦截
 * tip:只能写在一个配置类里
 */

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Autowired
    private TokenHandlerInterceptor tokenHandlerInterceptor;

    //构造方法
    public WebConfiguration(TokenHandlerInterceptor tokenHandlerInterceptor){
        this.tokenHandlerInterceptor = tokenHandlerInterceptor;
    }

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")    // 允许跨域访问的路径
                .allowedOriginPatterns("*")   // 允许跨域访问的源
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")    // 允许请求方法
                .maxAge(168000)    // 预检间隔时间
                .allowedHeaders("*")  // 允许头部设置
                .allowCredentials(true);    // 是否发送cookie
    }

    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer configurer){
        configurer.setTaskExecutor(new ConcurrentTaskExecutor(Executors.newFixedThreadPool(3)));
        configurer.setDefaultTimeout(30000);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        List<String> excludePath = new ArrayList<>();
        //排除拦截，除了注册登录(此时还没token)，其他都拦截
        excludePath.add("/admin/login");     //登入
        excludePath.add("/login");     //登入
        registry.addInterceptor(tokenHandlerInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns(excludePath);
        WebMvcConfigurer.super.addInterceptors(registry);
    }

}
