package com.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayPrintDuplicatesAndCount {

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter array size: ");
            var size = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.println("Enter array elements (space-separated): ");
            var input = sc.nextLine().split("\\s+");

            // Count occurrences of each element
            var elementCount = Arrays.stream(input)
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

            System.out.println("Element counts: " + elementCount);

            // Filter duplicates (count > 1)
            var duplicates = elementCount.entrySet().stream()
                    .filter(entry -> entry.getValue() > 1)
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue));

            System.out.println("Duplicate elements: " + duplicates);
        }
    }

}

