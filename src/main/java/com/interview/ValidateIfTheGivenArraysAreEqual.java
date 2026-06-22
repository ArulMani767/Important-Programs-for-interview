package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class ValidateIfTheGivenArraysAreEqual {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        // Input for the first array
        System.out.print("Enter elements for the first array (separated by spaces): ");
        String[] arr1 = scanner.nextLine().split("\\s+");

        // Input for the second array
        System.out.print("Enter elements for the second array (separated by spaces): ");
        String[] arr2 = scanner.nextLine().split("\\s+");

        // Validate and print the result
        arrayEquals(arr1, arr2);
    }
}

    static void arrayEquals(String[] arr1, String[] arr2) {
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("given arrays are equal");
        } else {
            System.out.println("given arrays are not equal");
        }
    }
}

