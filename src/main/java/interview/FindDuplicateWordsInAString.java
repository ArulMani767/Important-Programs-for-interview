package interview;

import java.util.*;
import java.util.stream.*;

public class FindDuplicateWordsInAString {

    // String input = "java is fun and java is fast";

    public static void main(String[] args) {
        // Try-with-resources manages the scanner's lifecycle automatically
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter a string sentence to find duplicate words:");
            var input = sc.nextLine();
            var arr= input.trim().split("\\s+");

            // UNCHANGED LOGIC: Step 1 - Split by spaces and group by frequency
            var wordCount = Arrays.stream(arr)
                    .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

            // UNCHANGED LOGIC: Step 2 - Filter map entries where count > 1
            var duplicates = wordCount.entrySet().stream()
                    .filter(e -> e.getValue() > 1)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            System.out.println("Duplicate words and their counts: " + duplicates);
        }
    }
}
