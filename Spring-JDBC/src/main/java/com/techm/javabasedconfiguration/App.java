package com.techm.javabasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
      
     StudentDao dao =  context.getBean(StudentDao.class);
     
      int x = dao.saveStudent(new Student(102,"lakshmi"));
      
      System.out.println(x + "row(s) inserted");
    }
}


