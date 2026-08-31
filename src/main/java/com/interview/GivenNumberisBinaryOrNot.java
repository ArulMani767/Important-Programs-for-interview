package com.interview;

import java.util.Scanner;

public class GivenNumberisBinaryOrNot {
    // inputs 10110101 is binary nuber and 123456 is not binary number
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter an integer to verify: ");
            var n = sc.nextInt();

            var isBinary = true;
            var copy = n;

            while (copy != 0) {
                var temp = copy % 10; // Extracts the last digit

                if (temp > 1) {
                    isBinary = false;
                    break;
                } else {
                    copy = copy / 10; // Truncates the last digit
                }
            }

            if (isBinary) {
                System.out.println(n + " is a binary number");
            } else {
                System.out.println(n + " is not a binary number");
            }
        }
    }
}
