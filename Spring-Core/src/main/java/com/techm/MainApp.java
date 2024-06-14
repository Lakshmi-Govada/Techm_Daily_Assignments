package com.techm;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");

        UserService1 userService = (UserService1) context.getBean("userService");

        userService.displayServiceInfo();
    }
}
