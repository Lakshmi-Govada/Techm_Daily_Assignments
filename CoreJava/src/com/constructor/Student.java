/*Write a Java class Student with a default constructor that initializes name to "Unknown" and age to 0. 
Create an object of this class and print its name and age.*/
package com.constructor;

public class Student {
    private String name;
    private int age;

    public Student() {
        name = "Unknown";
        age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}
