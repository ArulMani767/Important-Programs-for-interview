package com.interview;

import java.util.Scanner;

public class MissingNumberInArray {

    // inputs
    // int n = 8;

    // int[] a = {1, 4, 5, 3, 7, 8, 6};
    static int sumOfNnumbers(int n) {
        int sum = (n * (n + 1)) / 2;

        return sum;
    }

    // Method to calculate sum of all elements of array
    static int sumOfElements(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        // Try-with-resources cleanly manages the scanner instance automatically
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the total number of elements expected (n): ");
            var n = sc.nextInt();

            // The size of the array will be n - 1 since one number is missing
            var arraySize = n - 1;
            var a = new int[arraySize];

            System.out.println("Enter " + arraySize + " elements:");
            for (var i = 0; i < arraySize; i++) {
                a[i] = sc.nextInt();
            }

            // UNCHANGED LOGIC: Your exact steps to find the missing number
            // Step 1
            var sumOfNnumbers = sumOfNnumbers(n);

            // Step 2
            var sumOfElements = sumOfElements(a);

            // Step 3
            var missingNumber = sumOfNnumbers - sumOfElements;

            System.out.println("Missing Number is = " + missingNumber);
        }
    }
}
