package com.interview;

import java.util.Scanner;

public class GeometricSeries {
    //First term = 2, ratio = 2 you change to 3 also for both
    // 2, 4, 8, 16, 32, 64, 128,
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("enter the first term");
            var firstTerm = sc.nextInt();

            System.out.println("enter the common ratio");
            var ratio = sc.nextInt();

            System.out.println("enter the number of terms");
            var n = sc.nextInt();

            System.out.println("geometric series");

            var term = firstTerm;
            for (var i = 1; i <= n; i++) {
                System.out.print(term + " ");
                term = term * ratio;
            }
        }
    }
}
