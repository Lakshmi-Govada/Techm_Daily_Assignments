//Import the java.util.ArrayList class in your Java program and use it to store and retrieve elements.

package com.collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Print the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Access elements using index
        int firstElement = numbers.get(0);
        int secondElement = numbers.get(1);

        // Print the retrieved elements
        System.out.println("First Element: " + firstElement);
        System.out.println("Second Element: " + secondElement);
    }
}

