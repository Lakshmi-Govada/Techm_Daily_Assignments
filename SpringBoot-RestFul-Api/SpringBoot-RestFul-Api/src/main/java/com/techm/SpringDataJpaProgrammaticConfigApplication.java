package com.techm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaProgrammaticConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaProgrammaticConfigApplication.class, args);
    }

    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }
}
