package com.techm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Configuration class
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.techm")
public class SimpleSpringBootApp{

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringBootApp.class, args);
    }
}


