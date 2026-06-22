package com.interview;

import java.util.Scanner;

public class RotationOfOneStringInAnother {
//INPUTS ARE BELOW FOR SCANNER CLASS
    //String s1 = "JavaJ2eeStrutsHibernate";
 
       // String s2 = "StrutsHibernateJavaJ2ee";
    public static void main(String[] args) {

        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the first string (s1):");
            var s1 = sc.nextLine();

            System.out.println("Enter the second string (s2):");
            var s2 = sc.nextLine();

            // UNCHANGED LOGIC: Your exact string rotation check steps
            // Step 1
            if (s1.length() != s2.length()) {
                System.out.println("s2 is not rotated version of s1");
            } else {
                // Step 2
                var s3 = s1 + s1;

                // Step 3
                if (s3.contains(s2)) {
                    System.out.println("s2 is a rotated version of s1");
                } else {
                    System.out.println("s2 is not rotated version of s1");
                }
            }
        }
    }
}