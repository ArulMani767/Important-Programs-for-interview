package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class EqualityOfTwoStringArrays {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            
            // 1. Input for the First Array
            System.out.print("Enter the size of the first array: ");
            var size1 = sc.nextInt();
            sc.nextLine();
            var a1 = new String[size1];
            System.out.println("Enter " + size1 + " elements for the first array:");
            for (var i = 0; i < size1; i++) {
                a1[i] = sc.nextLine();
            }

            // 2. Input for the Second Array
            System.out.print("Enter the size of the second array: ");
            var size2 = sc.nextInt();
            sc.nextLine();
            var a2 = new String[size2];
            System.out.println("Enter " + size2 + " elements for the second array:");
            for (var i = 0; i < size2; i++) {
                a2[i] = sc.nextLine();
            }

            // 3. Check for Equality (Java 21 Style)
            // First check if lengths match; if they do, compare the elements using Arrays.equals
            var equal = (a1.length == a2.length) && Arrays.equals(a1, a2);

            // 4. Output the result
            System.out.println("Are the two arrays equal? " + equal);
        }
    }
}
