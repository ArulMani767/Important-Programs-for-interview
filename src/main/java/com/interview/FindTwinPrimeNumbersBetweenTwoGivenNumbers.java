package com.interview;

import java.util.*;

public class FindTwinPrimeNumbersBetweenTwoGivenNumbers {
    public static void main(String[] args) {
        // Try-with-resources handles the scanner lifecycle automatically
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the start value: ");
            var start = sc.nextInt();

            System.out.print("Enter the end value: ");
            var end = sc.nextInt();

            System.out.println("Twin prime numbers between " + start + " and " + end + " :");

            // Loop through the range. Stop 2 numbers before 'end' to prevent printing
            // values out of bounds
            for (var currentNum = start; currentNum <= end - 2; currentNum++) {

                // STEP 1: Check if the first number (currentNum) is prime using your exact
                // logic
                var isFirstPrime = true;
                if (currentNum <= 1) {
                    isFirstPrime = false;
                } else {
                    for (var i = 2; i <= currentNum / 2; i++) {
                        if (currentNum % i == 0) {
                            isFirstPrime = false;
                            break;
                        }
                    }
                }

                // STEP 2: Only check the second number (currentNum + 2) if the first one is
                // already prime
                if (isFirstPrime) {
                    var secondNum = currentNum + 2;
                    var isSecondPrime = true;

                    for (var i = 2; i <= secondNum / 2; i++) {
                        if (secondNum % i == 0) {
                            isSecondPrime = false;
                            break;
                        }
                    }

                    // If both passes succeed, we found a Twin Prime pair!
                    if (isSecondPrime) {
                        System.out.println("(" + currentNum + ", " + secondNum + ")");
                    }
                }
            }
        }
    }
}

