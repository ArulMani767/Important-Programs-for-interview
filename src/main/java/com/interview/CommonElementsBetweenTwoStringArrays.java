package com.interview;

import java.util.*;
import java.util.stream.*;

// inputs s1= apple banana cherry date
// s2= banana date elderberry fig
public class CommonElementsBetweenTwoStringArrays {
    public static void main(String[] args) {
        // Try-with-resources automatically manages the scanner's lifecycle
        try (var sc = new Scanner(System.in)) {

            // 1. Input for the First String Array using space-separated format
            System.out.println("Enter elements for the first array separated by spaces:");
            var input1 = sc.nextLine();
            var s1 = input1.trim().split("\\s+"); // Directly builds the first String[] array

            // 2. Input for the Second String Array using space-separated format
            System.out.println("Enter elements for the second array separated by spaces:");
            var input2 = sc.nextLine();
            var s2 = input2.trim().split("\\s+");

            // UNCHANGED LOGIC: Your functional stream filter intersection
            var set2 = Set.of(s2);
            var commonElements = Arrays.stream(s1)
                    .filter(set2::contains)
                    .collect(Collectors.toSet());

            System.out.println("Common elements: " + commonElements);
        }
    }
}
