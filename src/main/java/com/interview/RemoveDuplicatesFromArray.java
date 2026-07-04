package com.interview;

import java.util.*;


public class RemoveDuplicatesFromArray {
    // inputs CSK MI CSK RCB MI CSK

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the array elements (space-separated):");
            var inputLine = sc.nextLine();

            // treat input as an array of elements
            var inputArray = inputLine.split("\\s+");

            // Get the unique elements as a list (remove duplicates, preserve first occurrence order)
            var uniqueList = Arrays.stream(inputArray).distinct().toList();
            System.out.println("Unique elements as list: " + uniqueList);
        }
    }

}

