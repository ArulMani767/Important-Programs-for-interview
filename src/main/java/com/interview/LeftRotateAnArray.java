package com.interview;

import java.util.Arrays;
import java.util.*;

// usually rotate the array in left direction is also the other question for the below  program
//int[] inputArray = {1, 2, 3, 4, 5};
public class LeftRotateAnArray {

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            var size = sc.nextInt();

            var inputArray = new int[size];
            System.out.println("Enter " + size + " array elements (separated by spaces or lines):");
            for (int i = 0; i < size; i++) {
                inputArray[i] = sc.nextInt();
            }

            System.out.print("Enter the number of LEFT rotations (n): ");
            var n = sc.nextInt();

            // Create a temporary array to store the shifted values
            var result = new int[size];

            for (int i = 0; i < size; i++) {
                // LEFT SHIFT FORMULA (Adds size to handle negative remainder wrap-around)
                var newPosition = (i - n + size) % size;
                result[newPosition] = inputArray[i];
            }

            System.out.println("\nOriginal Array:     " + Arrays.toString(inputArray));
            System.out.println("Left Rotated Array: " + Arrays.toString(result));
        }
    }

}
