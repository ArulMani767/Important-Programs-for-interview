package com.interview;

import java.text.DecimalFormat;
import java.util.*;

public class FindPercentageOfUppercaseLowercaseDigitsAndSpecialCharactersInString {
    static void characterPercentage(String inputString) {
        // UNCHANGED LOGIC: Getting total number of characters
        var totalChars = inputString.length();

        // Initializing counters using modern 'var'
        var upperCaseLetters = 0;
        var lowerCaseLetters = 0;
        var digits = 0;
        var others = 0;

        // Iterating through each character of inputString
        for (var i = 0; i < inputString.length(); i++) {
            var ch = inputString.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCaseLetters++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseLetters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                others++;
            }
        }

        // Calculating percentage values
        var upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars;
        var lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;
        var digitsPercentage = (digits * 100.0) / totalChars;
        var otherCharPercentage = (others * 100.0) / totalChars;

        var formatter = new DecimalFormat("##.##");

        // Printing percentages matching your exact logic layout
        System.out.println("\nIn '" + inputString + "' : ");
        System.out.println("Uppercase letters are " + formatter.format(upperCaseLetterPercentage) + "% ");
        System.out.println("Lowercase letters are " + formatter.format(lowerCaseLetterPercentage) + "%");
        System.out.println("Digits Are " + formatter.format(digitsPercentage) + "%");
        System.out.println("Other Characters Are " + formatter.format(otherCharPercentage) + "%");
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        // Try-with-resources handles automatic scanner closing implicitly
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter any text string to analyze: ");

            // Using nextLine() to capture spaces and full sentences safely
            var userInput = sc.nextLine();

            // Pass the scanned string into your unchanged logic method
            characterPercentage(userInput);
        }
    }
}
