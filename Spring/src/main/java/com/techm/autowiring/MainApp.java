package com.techm.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		
	   ApplicationContext context = new 
			    ClassPathXmlApplicationContext("applicationContext.xml");
	   
	   
	   
	    Student student = (Student) context.getBean("stu");
	   
		
		
		System.out.println(student);
	}

}

/*note:
when we give autowire attribute value as byName, bean id value and bean class 
property name must be same.

and internally it will look for settter methods to perform setter injection 
*/

/*
 * when we give autowire attribute value as byType , spring ioc container will
 * look for bean class type and property type, if both are compatible or matched
 * then automatically injection will happen.
 * 
 * in case of byType, we no need to maintain bean id value and property name as
 * same.
 * 
 * but bean property type and class type must be matched
 */


/*
 * when we give autowire attribute value as constructor, it is exactly working
 * like when we give autowire attribute value as byType but only the differnce
 * is in this case , it is performing constructor injection
 * 
 */