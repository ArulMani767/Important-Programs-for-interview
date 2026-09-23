package interview;

import java.util.*;
import java.util.stream.*;

public class IntersectionOfTwoArrays {
    //inputs  String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"}; i1={1, 2, 3, 4, 5, 4}
 
        //String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"}; i2={3, 4, 5, 6, 7, 4};

        //intersection of two arrays and common elements between two arrays both are same 
    public static void main(String[] args) {

        // Try-with-resources to manage the scanner resource automatically
        try (var sc = new Scanner(System.in)) {

            // 1. Input for the First String Array
            System.out.println("Enter elements for the first array (separated by spaces):");
            var input1 = sc.nextLine();
            var s1 = input1.trim().split("\\s+"); // Splits by any amount of whitespace

            // 2. Input for the Second String Array
            System.out.println("Enter elements for the second array (separated by spaces):");
            var input2 = sc.nextLine();
            var s2 = input2.trim().split("\\s+");

            // 3. Java 21 Modern Intersection Logic
            // Convert the second array into a Set first for lightning-fast O(1) lookups
            Set<String> set2 = Arrays.stream(s2).collect(Collectors.toSet());

            // Filter s1 elements to keep only those present in set2, and collect to a Set
            // (removes duplicates)
            Set<String> intersectionSet = Arrays.stream(s1)
                    .filter(set2::contains)
                    .collect(Collectors.toSet());

            // 4. Output the common elements
            System.out.println("\nCommon elements (Intersection):");
            System.out.println(intersectionSet);
        }
    }
}
