package com.interview;

import java.util.*;

public class SumOfFirstNPrimeNumbers {

    public static void main(String[] args) {

        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n (how many prime numbers to sum): ");
            var n = sc.nextInt();

            var sum = 0;
            var countOfPrimesFound = 0;
            var currentNumberToCheck = 2; // Start checking from 2, the first prime number

            // Outer Loop: Keeps running until we find exactly 'n' prime numbers
            while (countOfPrimesFound < n) {

                // PRESERVED LOGIC: Assume current number is prime until proven otherwise
                var isPrime = true;

                // Your exact inner loop check logic
                for (var i = 2; i <= currentNumberToCheck / 2; i++) {
                    if (currentNumberToCheck % i == 0) {
                        isPrime = false; // Found a factor, so it's NOT prime
                        break; // Stop checking this number immediately
                    }
                }

                // If the inner loop finishes and isPrime is still true, we found a prime!
                if (isPrime) {
                    sum += currentNumberToCheck; // Add it to our total sum
                    countOfPrimesFound++; // Increment our prime counter
                }

                // Move to the very next number to check in the next iteration
                currentNumberToCheck++;
            }

            System.out.println("The sum of the first " + n + " prime numbers is: " + sum);
        }
    }
}
