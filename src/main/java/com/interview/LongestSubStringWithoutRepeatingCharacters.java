package com.interview;

import java.util.*;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
       try (var sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            var input = sc.nextLine();

            var map = new HashMap<Character, Integer>();
            var maxLength = 0;
            var left = 0;

            for (var right = 0; right < input.length(); right++) {
                var ch = input.charAt(right);

                // If character is already inside the current window, jump 'left' past it
                if (map.containsKey(ch)) {
                    left = Math.max(left, map.get(ch) + 1);
                }

                map.put(ch, right);
                maxLength = Math.max(maxLength, right - left + 1);
            }

            System.out.println("Max length: " + maxLength);
        }
    }
}
