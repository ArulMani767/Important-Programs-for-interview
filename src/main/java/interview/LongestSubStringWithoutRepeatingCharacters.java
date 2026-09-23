package interview;

import java.util.*;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            var input = sc.nextLine();

            var maxLength = 0;
            var left = 0;

            for (var i = 0; i < input.length();i++) {
                char ch = input.charAt(i);

                // Find the first occurrence of 'ch' starting from the 'left' pointer
                int firstSeen = input.indexOf(ch, left);

                // If found before 'right', a duplicate exists in the current window
                if (firstSeen < i) {
                    left = firstSeen + 1; // Move left past the duplicate
                }

                maxLength = Math.max(maxLength, i - left + 1);
            }

            System.out.println("Max length: " + maxLength);
        }
    }
}
