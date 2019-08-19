package com.shiyanlou.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//RestController相当于同时使用@Controller和@ResponseBody注解
public class ShiyanlouController {

    @RequestMapping("shiyanlou")
    public String shiyanlou() {
        return "Hello Shiyanlou";
    }
}