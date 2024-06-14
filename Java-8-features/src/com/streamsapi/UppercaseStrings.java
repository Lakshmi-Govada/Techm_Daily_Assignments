/*Write a Java program to create a stream of strings, convert each string to uppercase using the Stream API,
and collect the results into a new list.*/
package com.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        List<String> uppercaseStrings = strings.stream()
                                               .map(String::toUpperCase)
                                               .collect(Collectors.toList());

        System.out.println("Uppercase strings:");
        System.out.println(uppercaseStrings);
    }
}
