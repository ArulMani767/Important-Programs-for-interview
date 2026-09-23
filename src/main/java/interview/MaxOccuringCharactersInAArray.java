package interview;

import java.util.*;
import java.util.stream.*;

//it is also called as most repeated or or  most frequent  repetitive character in a string
public class MaxOccuringCharactersInAArray {

    // input String[] arr = { "a", "b", "a" };
    public static void main(String[] args) {
        // Try-with-resources manages the scanner's lifecycle automatically
       try (var sc = new Scanner(System.in)) {
            System.out.println("Enter elements for the first array separated by spaces:");
            var input = sc.nextLine();
            var array = input.trim().split("\\s+");

            // UNCHANGED LOGIC: Step 1 - Group and count frequencies
            var counts = Arrays.stream(array)
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

            // UNCHANGED LOGIC: Step 2 - Extract the entry with the highest count value
            var max = counts.entrySet().stream()
                    .max(Map.Entry.comparingByValue()).orElseThrow();

            System.out.println("Most frequent element: " + max.getKey());
            System.out.println("Occurrences: " + max.getValue());
        }
    }
}
