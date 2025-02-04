/*Annotations in Spring:
Discuss the usage of annotations like @Component, @Autowired  in Spring. Provide examples of how 
these annotations are used to configure Spring beans and manage dependencies without XML configuration.*/
package com.javabasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	private Address address;
	
	public String toString()
	{
		return   " " +address;
	}

}