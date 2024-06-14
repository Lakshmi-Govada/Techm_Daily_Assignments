package com.techm.xmlconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	StudentDao dao  = context.getBean(StudentDao.class);
    	
    
    	Student obj = new Student();
    	obj.setStid(200);
    	obj.setStname("venkat");
    	
    	int x = dao.saveStudent(obj);
    	System.out.println(x + "row(s) inserted");
    	
    }
}