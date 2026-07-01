package com.interview;

import java.util.Scanner;

public class FibonacciSeries {
    //inputs 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the number of terms to print: ");
            var n = sc.nextInt();

            var a = 0;
            var b = 1;

            System.out.println("The first " + n + " Fibonacci numbers are:");
            for (var i = 0; i < n; i++) {
                System.out.print(a + " ");
                var sum = a + b;
                a = b;
                b = sum;
            }
        }
    }
}
