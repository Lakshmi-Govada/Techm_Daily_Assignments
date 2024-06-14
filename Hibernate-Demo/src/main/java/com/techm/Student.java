package com.techm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Student {
	
	@Id
	private int stid;
	
	
	private String stname;
	
	
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public Student(int stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
	}
	
	public Student()
	{
		
	}

}