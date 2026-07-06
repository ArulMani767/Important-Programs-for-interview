package com.interview;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArraysIterativeLoop {
    public static void main(String[] args) {
        // Try-with-resources handles the scanner lifecycle safely
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter elements for the first array (space-separated):");
            var inputLine1 = sc.nextLine();
            var s1 = inputLine1.split("\\s+");

            System.out.println("Enter elements for the second array (space-separated):");
            var inputLine2 = sc.nextLine();
            var s2 = inputLine2.split("\\s+");

            // Modernizing the HashSet definition using 'var'
            var set = new HashSet<String>();

            // UNCHANGED LOGIC: Your exact nested loops and matching conditions
            for (int i = 0; i < s1.length; i++) {
                for (int j = 0; j < s2.length; j++) {
                    if (s1[i].equals(s2[j])) {
                        set.add(s1[i]);
                    }
                }
            }

            System.out.println("Common elements: " + set);
        }
    }
}
