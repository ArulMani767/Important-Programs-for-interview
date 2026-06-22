package com.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FirstRepeatedAndNonRepeatedCharacterString {
    static void firstRepeatedNonRepeatedChar(String inputString) {

        // 1. Group characters and count occurrences, maintaining input order
        Map<Character, Long> charCountMap = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new, // Crucial to preserve the string's original order
                        Collectors.counting()));

        // 2. Find the first non-repeated character (count == 1)
        charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresentOrElse(
                        c -> System.out.println("First Non-Repeated Character In '" + inputString + "' is '" + c + "'"),
                        () -> System.out.println("No Non-Repeated Character found in '" + inputString + "'"));

        // 3. Find the first repeated character (count > 1)
        charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresentOrElse(
                        c -> System.out.println("First Repeated Character In '" + inputString + "' is '" + c + "'"),
                        () -> System.out.println("No Repeated Character found in '" + inputString + "'"));
    }

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the string :");
            var input = sc.nextLine();

            firstRepeatedNonRepeatedChar(input);
        }
    }
}
