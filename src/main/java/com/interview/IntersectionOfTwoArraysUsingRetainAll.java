package com.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class IntersectionOfTwoArraysUsingRetainAll {

    //inputs 

     // Integer[] i1 = {1, 2, 3, 4, 5, 4};

 

       // Integer[] i2 = {3, 4, 5, 6, 7, 4};
    public static void main(String[] args) {

        try (var sc = new Scanner(System.in)) {
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
            HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));

            HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));

            set1.retainAll(set2);

            System.out.println(set1);
        }
    }

}
