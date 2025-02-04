/*Write a Java program that reads an integer from the user. Use try, catch, and finally blocks to handle
InputMismatchException and ensure the program prints a message when an invalid input is entered.*/
package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } 
    }
}
