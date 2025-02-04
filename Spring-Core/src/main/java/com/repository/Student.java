/*Dependency Injection (DI):
Describe the concept of Dependency Injection (DI) in Spring. Explain how to perform constructor-based and setter-based DI 
using XML configuration with examples.
*/
package com.repository;

public class Student {
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

	public Student() {

	}

	public Student(int stid, String stname) {
		super();
		System.out.println("constructor-1");
		this.stid = stid;
		this.stname = stname;
	}

	// business logic method
	public void display() {
		System.out.println("student id is: " + stid);
		System.out.println("student name is: " + stname);
	}
}
