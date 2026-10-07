package interview;

import java.util.Scanner;

public class SecondSmallestAndSmallestElementinIntegerArray {
    // Size of the array: 5
    // inputs 3 7 3 8 4
    // Console Output:
    // The smallest number is: 3
    // The second smallest number is: 4
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            var size = sc.nextInt();

            if (size < 2) {
                System.out.println("Array must have at least two elements.");
                return;
            }

            var input = new int[size];
            System.out.println("Enter " + size + " integers:");
            for (var i = 0; i < size; i++) {
                input[i] = sc.nextInt();
            }

            // INITIALIZATION: Start with the highest possible values for finding minimums
            var smallest = Integer.MAX_VALUE;
            var secondSmallest = Integer.MAX_VALUE;

            // Loop scans every element to track the lowest values
            for (int i = 0; i < input.length; i++) {
                if (input[i] < smallest) {
                    secondSmallest = smallest;
                    smallest = input[i];
                } else if (input[i] < secondSmallest && input[i] != smallest) {
                    secondSmallest = input[i];
                }
            }

            System.out.println("The smallest number is: " + smallest);
            System.out.println("The second smallest number is: "
                    + (secondSmallest == Integer.MAX_VALUE ? "None" : secondSmallest));
        }
    }
}
