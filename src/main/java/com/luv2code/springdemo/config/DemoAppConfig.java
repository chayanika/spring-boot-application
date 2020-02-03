//package com.luv2code.springdemo.config;
//
///**
// * @author Chayanika Ghosh
// */
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages="com.luv2code.springdemo")
//public class DemoAppConfig {
//    @Bean
//    public ViewResolver viewResolver() {
//
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//
//        viewResolver.setPrefix("/WEB-INF/view/");
//        viewResolver.setSuffix(".jsp");
//
//        return viewResolver;
//    }
//}
