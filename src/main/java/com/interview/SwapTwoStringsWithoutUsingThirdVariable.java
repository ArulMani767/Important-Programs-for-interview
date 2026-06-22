package com.interview;

import java.util.Scanner;

public class SwapTwoStringsWithoutUsingThirdVariable {

    // inputs s1="java" s2="python"
    public static void main(String[] args) {
        // Try-with-resources cleanly manages the scanner instance
        try (var sc = new Scanner(System.in)) {

            System.out.println("Enter First String :");

            var s1 = sc.next();

            System.out.println("Enter Second String :");

            var s2 = sc.next();

            System.out.println("Before Swapping :");

            System.out.println("s1 : " + s1);

            System.out.println("s2 : " + s2);

            // UNCHANGED LOGIC: Swapping starts

            s1 = s1 + s2;

            s2 = s1.substring(0, s1.length() - s2.length());

            s1 = s1.substring(s2.length());

            // Swapping ends

            System.out.println("After Swapping :");

            System.out.println("s1 : " + s1);

            System.out.println("s2 : " + s2);
        }
    }
}
