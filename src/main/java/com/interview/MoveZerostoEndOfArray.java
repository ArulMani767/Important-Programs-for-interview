package com.interview;

import java.util.Arrays;
import java.util.*;

//Enter the size of the array: 7
//Enter 7 integers (separated by spaces or lines):
//12 0 7 0 8 0 3

//Original Array: [12, 0, 7, 0, 8, 0, 3]
//Resulting Array: [12, 7, 8, 3, 0, 0, 0]

public class MoveZerostoEndOfArray {
    static void moveZerosToEnd(int[] inputArray) {
        // UNCHANGED LOGIC: Initializing counter to tracking non-zero placement index
        var counter = 0;

        // Traversing inputArray from left to right using 'var'
        for (var i = 0; i < inputArray.length; i++) {
            // If inputArray[i] is non-zero
            if (inputArray[i] != 0) {
                // Assigning inputArray[i] to inputArray[counter]
                inputArray[counter] = inputArray[i];

                // Incrementing the counter by 1
                counter++;
            }
        }

        // UNCHANGED LOGIC: Filling out the remaining slots at the end with zeros
        while (counter < inputArray.length) {
            inputArray[counter] = 0;
            counter++;
        }

        System.out.println("Resulting Array: " + Arrays.toString(inputArray));
    }

    public static void main(String[] args) {
        // Try-with-resources manages the scanner lifecycle automatically
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            var size = sc.nextInt();

            var userArray = new int[size];
            System.out.println("Enter " + size + " integers (separated by spaces or lines):");
            for (var i = 0; i < size; i++) {
                userArray[i] = sc.nextInt();
            }

            System.out.println("\nOriginal Array: " + Arrays.toString(userArray));

            // Execute the zero-shifting logic method
            moveZerosToEnd(userArray);
        }
    }
}
