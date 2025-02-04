//Implement a Java program that uses the Stream API to find and print the maximum element from a list of integers.
package com.streamsapi;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 15, 3, 20);

        Integer maxElement = numbers.stream()
                                     .max(Integer::compareTo)
                                     .orElse(null);

        if (maxElement != null) {
            System.out.println("Maximum element: " + maxElement);
        } else {
            System.out.println("List is empty.");
        }
    }
}
