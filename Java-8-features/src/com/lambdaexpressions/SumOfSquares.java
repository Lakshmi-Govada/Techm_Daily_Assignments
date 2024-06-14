//Write a Java program to calculate the sum of squares of elements in an integer array using lambda expressions.

package com.lambdaexpressions;

import java.util.Arrays;

public class SumOfSquares {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int sumOfSquares = Arrays.stream(numbers)
                                 .map(n -> n * n)
                                 .sum();

        System.out.println("Sum of squares: " + sumOfSquares);
    }
}
