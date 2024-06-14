/*Implement a Java program using HashMap to store and retrieve student names and their corresponding marks. 
Print the names and marks of all students.*/
package com.collections;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        // Create a HashMap to store student names and marks
        Map<Student, Integer> studentMarks = new HashMap<>();

        // Create student objects and add them to the HashMap
        Student student1 = new Student("John Doe", 85);
        Student student2 = new Student("Jane Smith", 92);
        Student student3 = new Student("Michael Johnson", 78);
        Student student4 = new Student("Emily Davis", 95);

        studentMarks.put(student1, student1.getMarks());
        studentMarks.put(student2, student2.getMarks());
        studentMarks.put(student3, student3.getMarks());
        studentMarks.put(student4, student4.getMarks());

        // Print the names and marks of all students
        System.out.println("Student Names and Marks:");
        for (Map.Entry<Student, Integer> entry : studentMarks.entrySet()) {
            Student student = entry.getKey();
            int marks = entry.getValue();
            System.out.println(student.getName() + " : " + marks);
        }
    }
}
