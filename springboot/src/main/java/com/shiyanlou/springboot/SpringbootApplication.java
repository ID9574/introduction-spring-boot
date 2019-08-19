package com.shiyanlou.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ImportResource;
// import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//通过@ImportResource加载xml配置文件
// @ImportResource(value = "classpath:config.xml")
@SpringBootApplication
public class SpringbootApplication {

    //设置配置类
    // @Configuration
    // static class WebConfig implements WebMvcConfigurer {

    //     //重写addResourceHandlers方法
    //     @Override
    //     public void addResourceHandlers(ResourceHandlerRegistry registry) {
    //         //设置静态资源映射路径为/**，资源位置为类路径下的upload
    //         registry.addResourceHandler("/**").addResourceLocations("classpath:/upload/");
    //     }
    // }


	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
