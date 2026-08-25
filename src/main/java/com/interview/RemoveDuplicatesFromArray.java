package com.interview;

import java.util.*;

public class RemoveDuplicatesFromArray {
    // inputs CSK MI CSK RCB MI CSK

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the elements (space-separated):");
            var inputLine = sc.nextLine();

            // 1. Separate line for array creation
            var arr = inputLine.trim().split("\\s+");

            // 2. Assign to ArrayList using Arrays.asList(arr)
            var originalList = new ArrayList<>(Arrays.asList(arr));

            // 3. Remove duplicates via Streams
            var uniqueList = originalList.stream()
                    .distinct()
                    .toList();

            System.out.println("Original ArrayList : " + originalList);
            System.out.println("Unique Elements    : " + uniqueList);
        }
    }
}
