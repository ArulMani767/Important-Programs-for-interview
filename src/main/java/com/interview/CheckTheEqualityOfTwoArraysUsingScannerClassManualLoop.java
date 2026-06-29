package com.interview;

import java.util.Scanner;

public class CheckTheEqualityOfTwoArraysUsingScannerClassManualLoop {
    public static void main(String[] args) {
        // Try-with-resources cleanly manages the scanner instance lifecycle
        try (var sc = new Scanner(System.in)) {

            // 1. Input configuration for the first array
            System.out.print("Enter size of first array: ");
            var size1 = sc.nextInt();
            var a1 = new int[size1];
            System.out.println("Enter elements of first array:");
            for (var i = 0; i < size1; i++) {
                a1[i] = sc.nextInt();
            }

            // 2. Input configuration for the second array
            System.out.print("Enter size of second array: ");
            var size2 = sc.nextInt();
            var a2 = new int[size2];
            System.out.println("Enter elements of second array:");
            for (var i = 0; i < size2; i++) {
                a2[i] = sc.nextInt();
            }

            // UNCHANGED LOGIC: Manual loop equality evaluation
            var equal = true;
            if (a1.length == a2.length) {
                for (var i = 0; i < a1.length; i++) {
                    if (a1[i] != a2[i]) {
                        equal = false;
                        break;
                    }
                }
            } else {
                equal = false; // Length mismatch guarantees arrays are unequal
            }

            System.out.println("Are arrays equal? " + equal);
        }
    }
}
