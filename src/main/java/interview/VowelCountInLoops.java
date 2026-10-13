package interview;

import java.util.Scanner;

public class VowelCountInLoops {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter a string (e.g., automation): ");
            var input = sc.nextLine();

            int vowelCount = 0;
            // A reference string containing all valid vowels (both cases)
            String vowels = "aeiouAEIOU";

            // Loop through every character in the input string
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                
                // indexOf returns -1 if the character is NOT found in "aeiouAEIOU"
                // If it returns anything >= 0, it means it IS a vowel.
                if (vowels.indexOf(currentChar) != -1) {
                    vowelCount++;
                }
            }

            System.out.println("Vowels (Traditional Loop): " + vowelCount);
        }
    }
}
