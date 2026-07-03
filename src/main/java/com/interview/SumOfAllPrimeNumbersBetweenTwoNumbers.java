package com.interview;

import java.util.*;

public class SumOfAllPrimeNumbersBetweenTwoNumbers {
    public static void main(String[] args) {
        // Try-with-resources handles the scanner lifecycle automatically
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the starting number: ");
            var start = sc.nextInt();

            System.out.print("Enter the ending number: ");
            var end = sc.nextInt();

            var sum = 0;

            // New Outer Loop: Iterates through the exact range provided by the user
            for (var currentNumberToCheck = start; currentNumberToCheck <= end; currentNumberToCheck++) {

                // PRESERVED LOGIC: Assume current number is prime until proven otherwise
                var isPrime = true;

                // PRESERVED LOGIC: Edge Case check for 0, 1, and negative numbers
                if (currentNumberToCheck <= 1) {
                    isPrime = false;
                } else {
                    // PRESERVED LOGIC: Your exact inner factor checking loop
                    for (var i = 2; i <= currentNumberToCheck / 2; i++) {
                        if (currentNumberToCheck % i == 0) {
                            isPrime = false; // Found a factor, so it's NOT prime
                            break; // Stop checking this number immediately
                        }
                    }
                }

                // PRESERVED LOGIC: If verified prime, add it to our running total sum
                if (isPrime) {
                    sum += currentNumberToCheck;
                }
            }

            System.out.println("The sum of all prime numbers between " + start + " and " + end + " is: " + sum);
        }
    }
}
