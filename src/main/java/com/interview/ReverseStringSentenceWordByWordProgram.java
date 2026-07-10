package com.interview;

import java.util.*;

public class ReverseStringSentenceWordByWordProgram {

    // inputs
    // String inputString = "Java is a programming language";
    public static void main(String[] args) {
        // Try-with-resources cleanly manages the scanner instance automatically
        try (var sc = new Scanner(System.in)) {

            System.out.println("Enter Input String :");
            var inputString = sc.nextLine();

            // Split logic moved directly into main
            String[] words = inputString.split("\\s");
            String outputString = "";

            // UNCHANGED LOGIC: Reversing the word order inside main method
            for (int i = words.length - 1; i >= 0; i--) {
                outputString = outputString + words[i] + " ";
            }

            System.out.println("Input String : " + inputString);
            System.out.println("Output String : " + outputString);
        }
    }
}
