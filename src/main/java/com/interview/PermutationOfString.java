package com.interview;

import java.util.Scanner;

public class PermutationOfString {

    //input string = "JSP";

    public static void StringPermutation(String input) {
        StringPermutation("", input);
    }

    private static void StringPermutation(String permutation, String input) {
        if (input.isEmpty()) {
            System.out.println(permutation);
        } else {
            for (var i = 0; i < input.length(); i++) {
                StringPermutation(
                        permutation + input.charAt(i),
                        input.substring(0, i) + input.substring(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        // Replaced hardcoded string with dynamic try-with-resources Scanner
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter a string to find all its permutations:");
            var userInput = sc.nextLine().trim();

            if (!userInput.isEmpty()) {
                System.out.println("\nPermutations:");
                StringPermutation(userInput);
            } else {
                System.out.println("Input cannot be empty.");
            }
        }
    }
}
