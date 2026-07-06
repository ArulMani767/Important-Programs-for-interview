package com.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindDuplicatesFromArray {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the array elements (space-separated):");
            var inputLine = sc.nextLine();

            // Treat input as an array of elements
            var inputArray = inputLine.trim().split("\\s+");

            // Get all element counts (preserve order)
            var charcount = Arrays.stream(inputArray)
                    .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));

            // Get only duplicate elements (count > 1)
            var duplicatecount = charcount.entrySet().stream()
                    .filter(entry -> entry.getValue() > 1)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            System.out.println("Duplicate elements with counts: " + duplicatecount);
        }
    }
}
