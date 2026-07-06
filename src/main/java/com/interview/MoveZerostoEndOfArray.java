package com.interview;

import java.util.*;
import java.util.stream.IntStream;

//Enter the size of the array: 7
//Enter 7 integers (separated by spaces or lines):
//12 0 7 0 8 0 3

//Original Array: [12, 0, 7, 0, 8, 0, 3]
//Resulting Array: [12, 7, 8, 3, 0, 0, 0]

public class MoveZerostoEndOfArray {
    public static void main(String[] args) {
        // Try-with-resources automatically manages the scanner's lifecycle
        try (var sc = new Scanner(System.in)) {

            // 1. Input for the integer array using space-separated format
            System.out.println("Enter integer elements separated by spaces:");
            var input1 = sc.nextLine();
           var arr= input1.trim().split("\\s+"); // Split the input string into an array of strings
            
            // Directly builds the primitive int[] array from the space-separated input string
            int[] inputArray = Arrays.stream(arr)
                                    .mapToInt(Integer::parseInt)
                                    .toArray();

            // UNCHANGED LOGIC: Pure stream pipeline to separate and join arrays
            // Step 1: Filter out all non-zero numbers
            var nonZeros = Arrays.stream(inputArray).filter(num -> num != 0);

            // Step 2: Filter out all the zeros
            var zeros = Arrays.stream(inputArray).filter(num -> num == 0);

            // Step 3: Glue them back together (Non-zeros first, zeros at the end)
            int[] result = IntStream.concat(nonZeros, zeros).toArray();

            System.out.println("Result: " + Arrays.toString(result));
        }
    }
}
