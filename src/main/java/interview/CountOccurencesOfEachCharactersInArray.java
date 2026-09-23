package interview;

import java.util.*;
import java.util.stream.*;

public class CountOccurencesOfEachCharactersInArray {
   //inputs  String[] array = { "A", "B", "A" };
    public static void main(String[] args) {
        // Try-with-resources cleanly manages the scanner lifecycle
       try (var sc = new Scanner(System.in)) {
            System.out.println("Enter elements for the first array separated by spaces:");
            var input = sc.nextLine();
            var array = input.trim().split("\\s+");
            // UNCHANGED LOGIC: Your exact functional stream pipeline
            var occurrences = Arrays.stream(array)
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

            System.out.println("Occurrences: " + occurrences);
        }
    }
}
