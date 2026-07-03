package com.interview;

import java.util.*;

public class RemoveVowelsInString {

    // inputs = Java Concept Of The Day
    public static void main(String[] args) {
        // Try-with-resources cleanly manages the scanner instance automatically
        try (var sc = new Scanner(System.in)) {

            System.out.println("Enter the string...");

            var inputString = sc.nextLine();

            var newInputString = inputString.replaceAll("[AEIOUaeiou]", "");

            System.out.println("The string without vowels...");

            System.out.println(newInputString);
        }
    }
}
