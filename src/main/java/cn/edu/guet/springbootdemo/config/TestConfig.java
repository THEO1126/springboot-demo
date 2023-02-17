//package cn.edu.guet.springbootdemo.config;
//
//import cn.edu.guet.springbootdemo.interceptor.TestHandlerInterceptor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * @Author 李冰冰
// * @Date 2023/02/16
// * @Version 17.0.5
// * 拦截器 测试 已成功
// */
//
//@Configuration
//public class TestConfig  implements WebMvcConfigurer {
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        String [] path={"/hello/**","/go/**"};
//        String [] Epath={"/user/go"};
//        registry.addInterceptor(new TestHandlerInterceptor()).addPathPatterns(path).excludePathPatterns(Epath);
//    }
//}
