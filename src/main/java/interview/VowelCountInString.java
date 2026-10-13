package interview;

import java.util.Scanner;

public class VowelCountInString {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter a string (e.g., automation): ");
            var input = sc.nextLine();

            // A reference string containing all valid vowels (both cases)
            String vowels = "aeiouAEIOU";

            // 1. .chars() converts the string into an IntStream
            // 2. .filter() keeps only characters that exist in our reference string
            // 3. .count() tallies them up
            long vowelCount = input.chars()
                    .filter(c -> vowels.indexOf(c) != -1)
                    .count();

            System.out.println("Vowels count: " + vowelCount);
        }
    }
}
