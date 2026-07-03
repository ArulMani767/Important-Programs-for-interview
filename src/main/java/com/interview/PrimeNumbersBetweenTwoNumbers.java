package com.interview;

import java.util.*;

public class PrimeNumbersBetweenTwoNumbers {
    public static void main(String[] args) {
        // Try-with-resources handles the scanner lifecycle automatically
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the starting number: ");
            var start = sc.nextInt();

            System.out.print("Enter the ending number: ");
            var end = sc.nextInt();

            System.out.println("Prime numbers between " + start + " and " + end + " are:");

            // Outer loop: Iterates through every single number in your given range
            for (var currentNum = start; currentNum <= end; currentNum++) {

                // PRESERVED LOGIC: Assume the current number is prime until proven otherwise
                var isPrime = true;

                // PRESERVED LOGIC: Edge Case check for 0, 1, and negative numbers
                if (currentNum <= 1) {
                    isPrime = false;
                } else {
                    // PRESERVED LOGIC: Your exact factor inspection loop
                    for (var i = 2; i <= currentNum / 2; i++) {
                        if (currentNum % i == 0) {
                            isPrime = false; // We found a divisor, so it's NOT prime
                            break; // Exit the inner loop immediately
                        }
                    }
                }

                // Match with the question: Print the number ONLY if it is verified as prime
                if (isPrime) {
                    System.out.print(currentNum + " ");
                }
            }
            System.out.println(); // Print a clean newline at the very end
        }
    }
}
