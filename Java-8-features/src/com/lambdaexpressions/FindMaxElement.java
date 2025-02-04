/*Implement a Java program that uses lambda expressions to find and print the maximum element from a list
of integers.
*/
package com.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);

        if (maxNumber.isPresent()) {
            System.out.println("Maximum element: " + maxNumber.get());
        } else {
            System.out.println("List is empty.");
        }
    }
}
