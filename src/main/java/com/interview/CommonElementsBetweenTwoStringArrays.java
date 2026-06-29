package com.interview;

import java.util.*;
import java.util.stream.*;

public class CommonElementsBetweenTwoStringArrays {
    public static void main(String[] args) {
        // Try-with-resources automatically manages the scanner's lifecycle
        try (var sc = new Scanner(System.in)) {

            // 1. Configure input for the first String array
            System.out.print("Enter the size of the first array: ");
            var size1 = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            var s1 = new String[size1];
            System.out.println("Enter " + size1 + " strings for the first array (one per line):");
            for (var i = 0; i < size1; i++) {
                s1[i] = sc.nextLine();
            }

            // 2. Configure input for the second String array
            System.out.print("Enter the size of the second array: ");
            var size2 = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            var s2 = new String[size2];
            System.out.println("Enter " + size2 + " strings for the second array (one per line):");
            for (var i = 0; i < size2; i++) {
                s2[i] = sc.nextLine();
            }

            // UNCHANGED LOGIC: Your functional stream filter intersection
            var set2 = Set.of(s2);
            var commonElements = Arrays.stream(s1)
                    .filter(set2::contains)
                    .collect(Collectors.toSet());

            System.out.println("Common elements: " + commonElements);
        }
    }
}
