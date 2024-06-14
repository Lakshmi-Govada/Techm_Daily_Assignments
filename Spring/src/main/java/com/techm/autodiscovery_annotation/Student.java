package com.techm.autodiscovery_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	@Autowired
	private Address address;
	
	

	public String toString()
	{
		return  " " + address;
	}
	
}