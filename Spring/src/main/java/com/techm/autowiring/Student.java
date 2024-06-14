package com.techm.autowiring;

public class Student {
	
	
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String toString()
	{
		return  " " + address;
	}
	
}