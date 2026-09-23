package interview;

import java.util.*;

public class ReverseStringSentenceWordByWordProgram {

    // inputs
    // String inputString = "Java is a programming language"; and reverse an array program both are same logic
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter Input String :");
            var inputString = sc.nextLine();

            var words = inputString.trim().split("\\s+");
            
            // Using mutable StringBuilder instead of immutable String
            var outputString = new StringBuilder();

            // Same loop logic: traversing words in reverse order
            for (int i = words.length - 1; i >= 0; i--) {
                outputString.append(words[i]).append(" ");
            }

            System.out.println("Input String  : " + inputString);
            System.out.println("Output String : " + outputString);
        }
    }
}
