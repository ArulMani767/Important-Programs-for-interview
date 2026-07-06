package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        // Try-with-resources handles the scanner resource lifecycle automatically
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter list elements (separated by spaces):");
            var inputLine = sc.nextLine();

            // Split user input by whitespace into an array, then convert it to an ArrayList
            var tokens = inputLine.trim().split("\\s+");
            var listWithDuplicates = new ArrayList<>(Arrays.asList(tokens));

            System.out.println("\nOriginal ArrayList: " + listWithDuplicates);

            // 1. Pass the ArrayList to a LinkedHashSet to instantly strip copies and keep
            // insertion order
            var clearSet = new LinkedHashSet<>(listWithDuplicates);

            // 2. Wipe the original list clear and re-populate it with the unique entries
            listWithDuplicates.clear();
            listWithDuplicates.addAll(clearSet);

            System.out.println("Unique ArrayList:   " + listWithDuplicates);
        }
    }
}
