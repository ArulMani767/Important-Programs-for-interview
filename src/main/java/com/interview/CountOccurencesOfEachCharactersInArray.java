package com.interview;

import java.util.*;
import java.util.stream.*;

public class CountOccurencesOfEachCharactersInArray {
   //inputs  String[] array = { "A", "B", "A" };
    public static void main(String[] args) {
        // Try-with-resources cleanly manages the scanner lifecycle
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements for the array: ");
            var size = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character

            var array = new String[size];
            System.out.println("Enter " + size + " string elements (one per line):");
            for (var i = 0; i < size; i++) {
                array[i] = sc.nextLine();
            }

            // UNCHANGED LOGIC: Your exact functional stream pipeline
            var occurrences = Arrays.stream(array)
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

            System.out.println("Occurrences: " + occurrences);
        }
    }
}
