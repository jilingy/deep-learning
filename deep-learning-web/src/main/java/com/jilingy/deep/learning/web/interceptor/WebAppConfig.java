//package com.jilingy.deep.learning.web.interceptor;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * @Description: Web配置
// * @Author: liudeyou
// * @Data: 2020/12/16 10:47
// */
//@Configuration
//public class WebAppConfig implements WebMvcConfigurer {
//
//    //要注册的拦截器
//    @Autowired
//    TicketInterceptor ticketInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //注册拦截器、排除、添加
//        registry.addInterceptor(ticketInterceptor)
//                .excludePathPatterns("/**/*.css", "/**/*.js", "/**/*.png", "/**/*.jpg", "/**/*.jpeg")
//                .addPathPatterns("/register", "/login");
//    }
//}