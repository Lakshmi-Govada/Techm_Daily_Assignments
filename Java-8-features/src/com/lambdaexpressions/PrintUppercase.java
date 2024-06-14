//Write a Java program that uses lambda expressions to iterate through a list of strings and print each string in uppercase.
package com.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class PrintUppercase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        strings.forEach(s -> System.out.println(s.toUpperCase()));
    }
}
