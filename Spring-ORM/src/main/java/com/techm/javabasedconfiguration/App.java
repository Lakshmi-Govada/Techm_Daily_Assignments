package com.techm.javabasedconfiguration;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    	
    	StudentDao dao  = context.getBean(StudentDao.class);
    	
    
    	Student obj = new Student();
    	obj.setStid(201);
    	obj.setStname("guru");
    	
    	//int x = dao.saveStudent(obj);
    	//System.out.println(x + "row(s) inserted");
    	
    	List<Student> students = dao.listStudents();
    	
    	for(Student s:students)
    	{
    		System.out.println(s.getStid() + " " + s.getStname());
    	}
   	
    	
    }
}
