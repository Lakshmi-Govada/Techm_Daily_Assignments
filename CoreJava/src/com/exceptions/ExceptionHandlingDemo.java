package com.exceptions;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle ArithmeticException
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Close the scanner in the finally block
            scanner.close();
            System.out.println("Scanner closed in finally block.");
        }
    }
}
