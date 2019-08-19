package com.shiyanlou.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController //RestController相当于同时使用@Controller和@ResponseBody注解

// @PropertySource(value="classpath:shiyanlou.properties")
@Controller
public class ShiyanlouController {

    //使用@Value注解注入属性值
    // @Value("${shiyanlou.springboot}")
    // @Value("${shiyanlou.test}")
    // private String shiyanlou;

    @RequestMapping("shiyanlou")
    public String shiyanlou() {
        return "shiyanlou";
    }
}