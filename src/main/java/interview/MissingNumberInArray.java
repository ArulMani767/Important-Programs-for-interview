package interview;

import java.util.*;

public class MissingNumberInArray {

    // inputs
    // int n = 8;

    public static void main(String[] args) {
        // Try-with-resources cleanly manages the scanner instance automatically
        try (var sc = new Scanner(System.in)) {

            System.out.print("Enter the total number of elements expected (n): ");
            var n = sc.nextInt();

            // Sum of numbers from 1 to n
            var sum = n * (n + 1) / 2;

            System.out.println("Enter " + (n - 1) + " elements:");

            for (int i = 0; i < n - 1; i++) {

                int num = sc.nextInt(); // Read a number

                sum = sum - num; // Subtract it from the total sum
            }

            System.out.println("Missing Number = " + sum);
        }

        // Alternative approach using Streams (also works when 1 or multiple numbers are
        // missing)
        /*
         * int[] nums = {1, 4, 5, 3, 7, 8, 6};
         * var expectedN = 8;
         * 
         * // For a single missing number using Streams:
         * var missingSingle = IntStream.rangeClosed(1, expectedN).sum() -
         * Arrays.stream(nums).sum();
         * System.out.println("Missing Number = " + missingSingle);
         * 
         * // For finding one or multiple missing numbers using Streams:
         * var present = Arrays.stream(nums).boxed().collect(Collectors.toSet());
         * var missingAll = IntStream.rangeClosed(1, expectedN)
         * .filter(x -> !present.contains(x))
         * .boxed()
         * .toList();
         * System.out.println("Missing Numbers = " + missingAll);
         */
    }
}
