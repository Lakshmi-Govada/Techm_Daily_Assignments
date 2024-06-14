package com.accessspecifier2;

import com.accessspecifier1.Person;

public class Employee extends Person {
    public void displayInfo() {
        // Access the protected age variable from the superclass
        System.out.println("Employee Age: " + age);

        // Access the default address variable from the superclass
        System.out.println("Employee Address: " + address);

        // Uncomment the line below to test accessing private variable (name) - Will cause compile-time error
        // System.out.println("Employee Name: " + name); // Compile-time error: name has private access in Person
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setAge(30);
        employee.setAddress("123 Main Street");

        employee.displayInfo();
    }
}


//we cannot access default values from other package other class