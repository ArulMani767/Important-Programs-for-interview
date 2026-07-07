package com.interview;

import java.util.*;

public class ReverseandAddANumberUntilYouGetPalindrome {
    static int reverseNumber(int number) {
        var reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        return reverse;
    }

    static void reverseAndAdd(int number) {
        var reverse = reverseNumber(number);

        // If the initial number is already a palindrome, handle it instantly
        if (number == reverse) {
            System.out.println("Given Number is already a palindrome");
            return;
        }

        // Keep looping as long as the number doesn't match its reverse
        while (number != reverse) {
            var sum = number + reverse;
            System.out.println(number + " + " + reverse + " = " + sum);

            number = sum;
            reverse = reverseNumber(number); // Calculate new reverse for the next loop check
        }

        System.out.println("Final Palindrome Number: " + number);
    }

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter Number: ");
            var inputNumber = sc.nextInt();

            reverseAndAdd(inputNumber);
        }
    }
}
