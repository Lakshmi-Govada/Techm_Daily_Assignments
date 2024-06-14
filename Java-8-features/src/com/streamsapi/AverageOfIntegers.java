/*Implement a Java program that reads a list of integers from the user, creates a stream, and uses
the Stream API to calculate and print the average of these integers.*/
package com.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 'done' to finish input):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'done' to finish input.");
            }
        }

        if (!numbers.isEmpty()) {
            double average = numbers.stream()
                                    .mapToInt(Integer::intValue)
                                    .average()
                                    .orElse(0.0);

            System.out.println("Average of the entered integers: " + average);
        } else {
            System.out.println("No integers entered.");
        }

        scanner.close();
    }
}
