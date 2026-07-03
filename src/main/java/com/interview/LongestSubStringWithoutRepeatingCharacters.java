package com.interview;

import java.util.HashSet;
import java.util.*;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        // Try-with-resources manages the scanner lifecycle automatically
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            var input = sc.nextLine();

            var charSet = new HashSet<Character>();
            var maxLength = 0;
            var leftPointer = 0;

            // The right pointer expands the window character by character
            for (var rightPointer = 0; rightPointer < input.length(); rightPointer++) {
                var currentRepeatedChar = input.charAt(rightPointer);

                // If the character is already in our set, shrink the window from the left
                while (charSet.contains(currentRepeatedChar)) {
                    charSet.remove(input.charAt(leftPointer));
                    leftPointer++;
                }

                // Add the new unique character to the current window set
                charSet.add(currentRepeatedChar);

                // Calculate the size of the current window and update our maximum record
                var currentWindowSize = rightPointer - leftPointer + 1;
                maxLength = Math.max(maxLength, currentWindowSize);
            }

            System.out.println("Length of the longest substring without repeating characters: " + maxLength);
        }
    }
}
