package com.interview;

import java.util.*;


public class IntersectionOfTwoIntegerArraysUsingRetainAll {

    // inputs

    // Integer[] i1 = {1, 2, 3, 4, 5, 4};

    // intersection and common characters between two integer arrays are same

    // Integer[] i2 = {3, 4, 5, 6, 7, 4};
    public static void main(String[] args) {

        try (var sc = new Scanner(System.in)) {
            // 1. Input for the first array
            // 1. Input for the first array
            System.out.print("Enter the size of the first array: ");
            var size1 = sc.nextInt();
            var i1 = new Integer[size1];
            System.out.println("Enter " + size1 + " integers:");
            for (var i = 0; i < size1; i++) {
                i1[i] = sc.nextInt();
            }

            // 2. Input for the second array
            System.out.print("Enter the size of the second array: ");
            var size2 = sc.nextInt();
            var i2 = new Integer[size2];
            System.out.println("Enter " + size2 + " integers:");
            for (var i = 0; i < size2; i++) {
                i2[i] = sc.nextInt();
            }

            // UNCHANGED LOGIC: Your exact HashSet collection and retainAll steps
           var set1 = new HashSet<>();
            for (var num : i1) {
                set1.add(num);
            }

            var set2 = new HashSet<>();
            for (var num : i2) {
                set2.add(num);
            }

            // Retain common elements
            set1.retainAll(set2);

            System.out.println(set1);
        }
    }

}
