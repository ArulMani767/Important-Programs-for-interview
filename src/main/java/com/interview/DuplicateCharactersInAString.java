package com.interview;


import java.util.*;
import java.util.stream.*;

public class DuplicateCharactersInAString {
    // input String ="hello"
   public static void main(String[] args) {
        // Try-with-resources cleanly manages the scanner instance automatically
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the string:");
            var s = sc.nextLine();

            // UNCHANGED LOGIC: Your exact functional stream pipelines
            var counts = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,
                    Collectors.counting()));
                    
            counts.entrySet().stream().filter(e -> e.getValue() > 1).forEach(System.out::println);
        }
    }
}

