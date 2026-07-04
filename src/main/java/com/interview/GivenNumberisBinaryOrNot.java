package com.interview;

import java.util.Scanner;

public class GivenNumberisBinaryOrNot {
    static void isBinaryOrNot(int number) {
        // Initializing flag and copy variable using 'var'
        var isBinary = true;
        var copyOfNumber = number;

        while (copyOfNumber != 0) {
            var temp = copyOfNumber % 10; // Gives last digit of the number

            if (temp > 1) {
                isBinary = false;
                break;
            } else {
                copyOfNumber = copyOfNumber / 10; // Removes last digit from the number
            }
        }

        // UNCHANGED LOGIC: Printing the final outcome evaluation
        if (isBinary) {
            System.out.println(number + " is a binary number");
        } else {
            System.out.println(number + " is not a binary number");
        }
    }

    public static void main(String[] args) {
        // Try-with-resources manages the scanner lifecycle safely and automatically
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter an integer to verify: ");
            var userInput = sc.nextInt();

            // Pass the scanned int directly into your unchanged logic method
            isBinaryOrNot(userInput);
        }
    }
}
