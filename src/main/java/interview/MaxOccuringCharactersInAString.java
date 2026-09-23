package interview;

import java.util.*;
import java.util.stream.*;

public class MaxOccuringCharactersInAString {

    // String input = "java"; it is also called as most repeated or or most frequent
    // repetitive character in a string
    public static void main(String[] args) {
        // Try-with-resources cleanly manages the scanner instance automatically
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the string:");
            var input = sc.nextLine();

            // UNCHANGED LOGIC: Your exact functional stream pipelines
            var counts = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,
                    Collectors.counting()));

            var max = counts.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
            System.out.println("Most frequent element: " + max.getKey());
            System.out.println("Occurrences: " + max.getValue());

        }
    } 
}
