package com.interview;

import java.util.Scanner;

public class ReverseStringWordByWordProgram {

    //inputs
        // String inputString = "Java is a programming language";
    public static String reverseTheSentence(String inputString) {
        String[] words = inputString.split("\\s");

        String outputString = "";

        // UNCHANGED LOGIC: Reversing the word order
        for (int i = words.length - 1; i >= 0; i--) {
            outputString = outputString + words[i] + " ";
        }

        return outputString;
    }

    public static void main(String[] args) {
        // Try-with-resources cleanly manages the scanner instance automatically
        try (var sc = new Scanner(System.in)) {

            System.out.println("Enter Input String :");

            var inputString = sc.nextLine();

            var outputString = reverseTheSentence(inputString);

            System.out.println("Input String : " + inputString);

            System.out.println("Output String : " + outputString);
        }
    }
}
