package interview;

import java.util.*;
import java.util.stream.IntStream;

public class MergeTwoUnSortedArraysInSortedOrder {
    // input
    // { 27, 8, 71, -9, 18 } first
    // { 12, -7, 18, 9, 37, -1, 21 } second

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {

            // 1. Gather the first array input
            System.out.print("Enter the size of the first array: ");
            var size1 = sc.nextInt();
            var input = new int[size1];
            System.out.println("Enter " + size1 + " integers for the first array:");
            for (var i = 0; i < size1; i++) {
                input[i] = sc.nextInt();
            }

            // 2. Gather the second array input
            System.out.print("Enter the size of the second array: ");
            var size2 = sc.nextInt();
            var input2 = new int[size2];
            System.out.println("Enter " + size2 + " integers for the second array:");
            for (var i = 0; i < size2; i++) {
                input2[i] = sc.nextInt();
            }

            int[] merged = new int[input.length + input2.length];
            System.arraycopy(input, 0, merged, 0, input.length);
            System.arraycopy(input2, 0, merged, input.length, input2.length);

            // Optional: Uncomment the line below if you also want the merged array sorted
             Arrays.sort(merged);

            // another way in stream

            /* var merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)) 
                    .toArray(); */  // This line merges the two arrays into a single array without sorting

        }

    }

}
