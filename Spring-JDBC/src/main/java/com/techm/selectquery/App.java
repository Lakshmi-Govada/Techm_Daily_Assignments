package com.techm.selectquery;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techm.javabasedconfiguration.MyConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
      
     StudentDao dao =  context.getBean(StudentDao.class);
     
      
     
       List<Student> studentsList = dao.getAllStudents();
       
       
       for(Student st:studentsList)
       {
    	   System.out.println(st.getStid() + "" + st.getStname());
       }
       
       System.out.println("using rowmapper ");
       
       List<Student> students = dao.getAllEmployeesRowMapper();
       
       for(Student st:students)
       {
    	   System.out.println(st.getStid() + " " + st.getStname());
       }
       
       
       
       
       
       
    }
}

