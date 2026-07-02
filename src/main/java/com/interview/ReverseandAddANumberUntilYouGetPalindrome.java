package com.interview;

import java.util.Scanner;

public class ReverseandAddANumberUntilYouGetPalindrome {
    static int reverseNumber(int number) {
        var reverse = 0;
        var rem = 0;

        while (number != 0) {
            rem = number % 10;
            reverse = (reverse * 10) + rem;
            number = number / 10;
        }

        return reverse;
    }

    // UNCHANGED LOGIC: Method to check for palindrome
    static boolean checkPalindrome(int number) {
        var reverse = reverseNumber(number);
        return reverse == number; // Simplified if-else block
    }

    // UNCHANGED LOGIC: Reverse and add until a palindrome is reached
    static void reverseAndAdd(int number) {
        if (checkPalindrome(number)) {
            System.out.println("Given Number is already a palindrome");
        } else {
            while (!checkPalindrome(number)) {
                var reverse = reverseNumber(number);
                var sum = number + reverse;

                System.out.println(number + " + " + reverse + " = " + sum);

                number = sum;
            }
            System.out.println("Final Palindrome Number: " + number);
        }
    }

    public static void main(String[] args) {
        // Try-with-resources handles automatic scanner closing implicitly
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter Number: ");
            var inputNumber = sc.nextInt();

            reverseAndAdd(inputNumber);
        }
    }
}
