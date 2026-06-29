package com.interview;

import java.util.stream.*;
import java.util.Scanner;
import java.util.Set;

public class CommonCharactersBetweenTwoStrings {
    public static void main(String[] args) {
        // Try-with-resources manages the scanner lifecycle cleanly
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the first string: ");
            var s1 = sc.nextLine();

            System.out.print("Enter the second string: ");
            var s2 = sc.nextLine();

            // UNCHANGED LOGIC: Convert first string characters into a unique Set
            Set<Character> firstSet = s1.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toSet());

            // UNCHANGED LOGIC: Filter second string characters that exist in the first set
            var commonChars = s2.chars()
                    .mapToObj(c -> (char) c)
                    .filter(firstSet::contains)
                    .collect(Collectors.toSet());

            System.out.println("Common characters: " + commonChars);
        }
    }
}
