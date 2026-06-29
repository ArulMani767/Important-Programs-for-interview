package com.interview;

import java.util.*;
import java.util.stream.*;

public class MaxOccuringCharactersInAArray {

    //input  String[] arr = { "a", "b", "a" };
   public static void main(String[] args) {
        // Try-with-resources manages the scanner's lifecycle automatically
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements for the array: ");
            var size = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character

            var arr = new String[size];
            System.out.println("Enter " + size + " string elements (one per line):");
            for (var i = 0; i < size; i++) {
                arr[i] = sc.nextLine();
            }

            // UNCHANGED LOGIC: Step 1 - Group and count frequencies
            var counts = Arrays.stream(arr)
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

            // UNCHANGED LOGIC: Step 2 - Extract the entry with the highest count value
            var max = counts.entrySet().stream()
                    .max(Map.Entry.comparingByValue())
                    .get();

            System.out.println("Most frequent element: " + max.getKey());
        }
    }
}

