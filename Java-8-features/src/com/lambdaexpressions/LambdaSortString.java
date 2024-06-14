package com.lambdaexpressions;

import java.util.Arrays;
import java.util.Collections;

public class LambdaSortString {
    public static void main(String[] args) {
        String[] strings = {"apple", "orange", "banana", "kiwi", "grape"};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(strings));

        Arrays.sort(strings, (s1, s2) -> s2.compareTo(s1));

        System.out.println("After sorting in descending order:");
        System.out.println(Arrays.toString(strings));
    }
}
