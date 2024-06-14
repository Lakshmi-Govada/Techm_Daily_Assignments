package com.techm.autodiscovery_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		
	   ApplicationContext context = new 
			    ClassPathXmlApplicationContext("application.xml");
	   
	   
	   
	    Student student = (Student) context.getBean("stu");
	   
		
		
		System.out.println(student);
	}

}
