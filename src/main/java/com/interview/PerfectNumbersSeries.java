package com.interview;

import java.util.Scanner;

public class PerfectNumbersSeries {
    // 6, 28, 496, 8128, 33550336
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("enter the upper limit to check up to");
            var limit = sc.nextInt();

            System.out.println("perfect numbers up to " + limit);

            for (var num = 1; num <= limit; num++) {
                var sum = 0;
                for (var i = 1; i < num; i++) {
                    if (num % i == 0) {
                        sum = sum + i;
                    }
                }
                if (sum == num && num != 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
