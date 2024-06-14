package com.techm.bytype_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		
	   ApplicationContext context = new 
			    ClassPathXmlApplicationContext("context.xml");
	   
	   
	   
	    Student student = (Student) context.getBean("stu");
	   
		
		
		System.out.println(student);
	}

}