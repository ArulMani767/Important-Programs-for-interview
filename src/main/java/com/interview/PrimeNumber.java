package com.interview;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("enter the number");
            var input = sc.nextInt();

            // Assume the number is prime until proven otherwise
            var isPrime = true;

            // Edge Case: 0, 1, and negative numbers are mathematically not prime
            if (input <= 1) {
                isPrime = false;
            } else {
                // Look for any factor from 2 up to half of the input number
                for (var i = 2; i <= input / 2; i++) {
                    if (input % i == 0) {
                        isPrime = false; // We found a divisor, so it's NOT prime
                        break; // Exit the loop immediately to save processing time
                    }
                }
            }

            // Print the definitive decision exactly ONCE after the loop finishes
            if (isPrime) {
                System.out.println(input + "  a prime number");
            } else {
                System.out.println(input + " not a prime number");
            }
        }
    }
}
