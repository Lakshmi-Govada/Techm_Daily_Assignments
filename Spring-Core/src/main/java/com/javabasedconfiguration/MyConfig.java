package com.javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.javabasedconfiguration")
public class MyConfig {

	/*
	 * @Bean public Student getStudent() { return new Student(); }
	 * 
	 * @Bean public Address getAddress() { return new Address(); }
	 */
}