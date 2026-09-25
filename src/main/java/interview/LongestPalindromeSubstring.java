package interview;

import java.util.Scanner;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            var input = sc.nextLine();

            // Clean the string (your logic, unchanged)
            var cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            String longest = findLongestPalindrome(cleaned);

            System.out.println("Longest palindromic substring: \"" + longest + "\"");
        }
    }

    static String findLongestPalindrome(String input) {
        String longest = "";

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String sub = input.substring(i, j);

                if (isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }

    // Your PalindromeCheckForString logic, extracted into a reusable method
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
