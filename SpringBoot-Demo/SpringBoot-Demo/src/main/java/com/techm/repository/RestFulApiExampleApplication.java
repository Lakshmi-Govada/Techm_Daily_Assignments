package com.techm.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestFulApiExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestfulApiExampleApplication.class, args);
    }

    @Bean
    public ProductService productService() {
        return new ProductService();
    }
}
