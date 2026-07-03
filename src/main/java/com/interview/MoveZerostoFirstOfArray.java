package com.interview;

import java.util.Arrays;
import java.util.*;

public class MoveZerostoFirstOfArray {
    static void moveZerosToFront(int[] inputArray) {
        // UNCHANGED LOGIC: Initializing counter to position of last element
        var counter = inputArray.length - 1;

        // Traversing the inputArray from right to left using 'var'
        for (var i = inputArray.length - 1; i >= 0; i--) {
            // If inputArray[i] is non-zero
            if (inputArray[i] != 0) {
                // Assigning inputArray[i] to inputArray[counter]
                inputArray[counter] = inputArray[i];

                // Decrementing the counter by 1
                counter--;
            }
        }

        // UNCHANGED LOGIC: Assigning 0 to remaining elements at the front
        while (counter >= 0) {
            inputArray[counter] = 0;
            counter--;
        }

        System.out.println("Resulting Array: " + Arrays.toString(inputArray));
    }

    public static void main(String[] args) {
        // Try-with-resources handles automatic scanner closing implicitly
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            var size = sc.nextInt();

            var userArray = new int[size];
            System.out.println("Enter " + size + " integers (separated by spaces or lines):");
            for (var i = 0; i < size; i++) {
                userArray[i] = sc.nextInt();
            }

            System.out.println("\nOriginal Array: " + Arrays.toString(userArray));

            // Execute your unchanged right-to-left shifting logic method
            moveZerosToFront(userArray);
        }
    }
}
