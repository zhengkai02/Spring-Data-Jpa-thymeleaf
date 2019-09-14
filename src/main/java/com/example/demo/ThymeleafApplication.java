package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThymeleafApplication extends SpringBootServletInitializer {
    @Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(ThymeleafApplication.class);
    }

    public static void main(String[] args)throws Exception {
        SpringApplication.run(ThymeleafApplication.class, args);
    }

}
