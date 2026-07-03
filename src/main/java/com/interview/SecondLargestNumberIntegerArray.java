package com.interview;

import java.util.*;

public class SecondLargestNumberIntegerArray {
    static int secondLargest(int[] input) {
        // SIMPLIFIED INITIALIZATION: Start with the lowest possible values
        var firstLargest = Integer.MIN_VALUE;
        var secondLargest = Integer.MIN_VALUE;

        // Clean for-each loop scans every element seamlessly
        for (var num : input) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num < firstLargest && num > secondLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            var size = sc.nextInt();

            var array = new int[size];
            System.out.println("Enter " + size + " integers:");
            for (var i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            var result = secondLargest(array);
            System.out.println("The second largest number is: " + result);
        }
    }
}
