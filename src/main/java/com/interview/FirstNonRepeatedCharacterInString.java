package com.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

//input teeter

public class FirstNonRepeatedCharacterInString {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            var input = sc.nextLine();

            // Step 1: Count character frequencies while preserving original character order
            var charCountMap = input.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(
                            e -> e,
                            LinkedHashMap::new, // Maintains original string insertion order
                            Collectors.counting()));

            // Step 2: Find the first character with a count of 1
            var firstNonRepeated = charCountMap.entrySet().stream()
                    .filter(entry -> entry.getValue() == 1)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(null);

            // Step 3: Output result
            System.out.println("First Non-Repeated Character: " +
                    (firstNonRepeated != null ? firstNonRepeated : "None"));
        }
    }
}
