package com.interview;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int arm = 0, a, d, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        n = scanner.nextInt();
        d = n;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            arm = arm + (a * a * a);
        }
        if (arm == d) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
        scanner.close();
    }
}
