package interview;

import java.util.*;

public class SecondLargestNumberIntegerArray {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array:");
            var size = sc.nextInt();

            var input = new int[size];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < size; i++) {
                input[i] = sc.nextInt();
            }

            // Initialize both to the smallest possible integer
            var max = Integer.MIN_VALUE;
            var secondMax = Integer.MIN_VALUE;
            var thirdMax = Integer.MIN_VALUE;

            for (int i = 0; i < input.length; i++) {
                if (input[i] > max) {
                    // Previous max now becomes the second largest
                    thirdMax = secondMax;
                    secondMax = max;
                    max = input[i];
                } else if (input[i] > secondMax && input[i] != max) {
                    // Element is smaller than max, but larger than current secondMax
                    thirdMax = secondMax;
                    secondMax = input[i];
                } else if (input[i] > thirdMax && input[i] != secondMax && input[i] != max) {
                    thirdMax = input[i];
                }
            }

            if (secondMax == Integer.MIN_VALUE) {
                System.out.println("No distinct second largest element found (all elements are equal).");
            } else {
                System.out.println("Largest: " + max);
                System.out.println("Second Largest: " + secondMax);
                System.out.println("Third Largest: " + thirdMax);
            }
        }
    }

}
