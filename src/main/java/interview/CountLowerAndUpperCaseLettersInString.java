package interview;

import java.util.Scanner;

public class CountLowerAndUpperCaseLettersInString {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter a string (e.g., AutoMation 123): ");
            var input = sc.nextLine();

            // ==========================================
            // APPROACH 1: Java Streams (Cleanest & Modern)
            // ==========================================
            long upperStream = input.chars().filter(Character::isUpperCase).count();
            long lowerStream = input.chars().filter(Character::isLowerCase).count();

            System.out.println("Streams -> Uppercase: " + upperStream + ", Lowercase: " + lowerStream);

            // ==========================================
            // APPROACH 2: 1-Line Regex Trick (Shortest)
            // ==========================================
            // "[^A-Z]" removes everything EXCEPT uppercase letters
            int upperRegex = input.replaceAll("[^A-Z]", "").length();
            // "[^a-z]" removes everything EXCEPT lowercase letters
            int lowerRegex = input.replaceAll("[^a-z]", "").length();

            System.out.println("Regex   -> Uppercase: " + upperRegex + ", Lowercase: " + lowerRegex);

            // ==========================================
            // APPROACH 3: Traditional Loop (Single Pass)
            // ==========================================
            int upperLoop = 0;
            int lowerLoop = 0;

            for (char c : input.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    upperLoop++;
                } else if (Character.isLowerCase(c)) {
                    lowerLoop++;
                }
            }

            System.out.println("Loop    -> Uppercase: " + upperLoop + ", Lowercase: " + lowerLoop);
        }
    }
}
