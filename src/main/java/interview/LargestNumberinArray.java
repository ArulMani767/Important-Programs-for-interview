package interview;

import java.util.*;

public class LargestNumberinArray {

    // inputs int[] arr = {2, 5, 8, 3, 1, 11};

    public static void main(String[] args) {
        // Try-with-resources cleanly manages the scanner instance automatically
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            var size = sc.nextInt();

            var arr = new int[size];
            System.out.println("Enter " + size + " integers:");
            for (var i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // UNCHANGED LOGIC: Your exact maximum finding loop
            var max = arr[0];
            for (var i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("Maximum value: " + max);
        }
    }

}
