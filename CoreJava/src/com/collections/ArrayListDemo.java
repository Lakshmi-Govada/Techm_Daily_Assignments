/*Write a Java program to demonstrate the use of ArrayList. Add elements of different data types 
(e.g., integer, string) to the list and print them.*/

package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList to store elements of different data types
        ArrayList<Object> mixedList = new ArrayList<>();

        // Add elements of different data types to the ArrayList
        mixedList.add(10);
        mixedList.add("Hello");
        mixedList.add(3.14);
        mixedList.add(true);

        // Print the elements of the ArrayList
        System.out.println("Elements in mixedList:");

        for (Object element : mixedList) {
            System.out.println(element);
        }
    }
}
