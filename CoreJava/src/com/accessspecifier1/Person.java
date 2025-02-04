/*Define a Java class Person with instance variables name (private), age (protected), and address
(protected). Provide getter and setter methods for name and demonstrate accessing age and 
address from a subclass in a different package.*/
package com.accessspecifier1;


public class Person {
    private String name; // private access modifier for name
    protected int age; // protected access modifier for age
    protected String address; // default access modifier for address

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter methods for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
