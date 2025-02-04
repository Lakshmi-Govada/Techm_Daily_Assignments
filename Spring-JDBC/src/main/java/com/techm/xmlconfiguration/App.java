package com.techm.xmlconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      
     StudentDao dao =  context.getBean(StudentDao.class);
     
      int x = dao.saveStudent(new Student(100,"Ram"));
      
      System.out.println(x + "row(s) inserted");
    }
}
