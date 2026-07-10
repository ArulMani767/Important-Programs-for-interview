package com.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class FirstRepeatedAndNonRepeatedCharacterInString {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            var input = sc.nextLine();

            // Step 1: Count character frequencies while keeping their exact order
            Map<Character, Long> charCountMap = input.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(
                            e->e,
                            LinkedHashMap::new, // Crucial: maintains original string order
                            Collectors.counting()));

            // Step 2: Extract the first repeated character (count > 1)
            var firstRepeated = charCountMap.entrySet().stream()
                    .filter(entry -> entry.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(null);

            // Step 3: Extract the first non-repeated character (count == 1)
            var firstNonRepeated = charCountMap.entrySet().stream()
                    .filter(entry -> entry.getValue() == 1)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(null);

            // Step 4: Display the results
            System.out.println("First Repeated Character: " + (firstRepeated != null ? firstRepeated : "None"));
            System.out
                    .println("First Non-Repeated Character: " + (firstNonRepeated != null ? firstNonRepeated : "None"));
        }
    }
}
