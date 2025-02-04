/*Write a Java program to demonstrate the use of the Stream API to map a list of integers to their 
squares and print the results.*/
package com.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = numbers.stream()
                                       .map(n -> n * n)
                                       .collect(Collectors.toList());

        System.out.println("Squared numbers:");
        squares.forEach(System.out::println);
    }
}
