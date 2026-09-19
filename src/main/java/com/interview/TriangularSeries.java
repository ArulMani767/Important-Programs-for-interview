package com.interview;

import java.util.Scanner;

//1,3,6,10,15,21,28..
public class TriangularSeries {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("enter the number of terms");
            var n = sc.nextInt();

            System.out.println("triangular series");

            var sum = 0;
            for (var i = 1; i <= n; i++) {
                sum = sum + i;
                System.out.print(sum + " ");
            }
        }
    }
}
