package com.interview;

import java.util.*;
import java.util.stream.*;

public class CountOccurencesOfEachCharactersInString {
    public static void main(String[] args) {
        // Try-with-resources automatically manages the scanner's lifecycle
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            var inputString = sc.nextLine();

            // UNCHANGED LOGIC: Your exact character grouping and counting pipeline
            var charCounts = inputString.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

            System.out.println("Character occurrences: " + charCounts);
        }
    }
}
