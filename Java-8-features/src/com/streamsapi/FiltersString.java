/*Implement a Java program that uses the Stream API to filter and print strings from a list that 
start with the letter "A".
*/
package com.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");

        List<String> filteredStrings = strings.stream()
                                              .filter(s -> s.startsWith("A"))
                                              .collect(Collectors.toList());

        System.out.println("Strings that start with 'A':");
        filteredStrings.forEach(System.out::println);
    }
}
