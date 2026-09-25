package interview;

import java.util.Scanner;

public class PalindromeCheckForString {
    public static void main(String[] args) {
        // Try-with-resources handles automatic scanner closure
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            var input = sc.nextLine();

            // Remove spaces and convert to lowercase
            var cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int len = cleaned.length();
            var isPalindrome = true;

            // Compare characters from start and end moving toward the middle
            for (int i = 0; i < len / 2; i++) {
                if (cleaned.charAt(i) != cleaned.charAt(len - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            // Output result
            if (isPalindrome) {
                System.out.println("\"" + input + "\" is a palindrome.");
            } else {
                System.out.println("\"" + input + "\" is NOT a palindrome.");
            }
        }
    }
}
