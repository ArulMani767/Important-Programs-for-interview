package interview;

import java.util.Scanner;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            var input = sc.nextLine();

            // Clean the string
            var cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String longest = "";

            // Check every possible substring combination
            for (int i = 0; i < cleaned.length(); i++) {
                for (int j = i + 1; j <= cleaned.length(); j++) {

                    String sub = cleaned.substring(i, j);

                    // 1-Line Palindrome Check using built-in reverse()
                    String reversed = new StringBuilder(sub).reverse().toString();

                    // If it is a palindrome AND longer than our current record, update it
                    if (sub.equals(reversed) && sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }

            System.out.println("Longest palindromic substring: \"" + longest + "\"");
        }
    }
}
