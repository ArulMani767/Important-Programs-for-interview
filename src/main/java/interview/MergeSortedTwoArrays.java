package interview;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MergeSortedTwoArrays {
    public static void main(String[] args) {
        // The try-with-resources block automatically closes the Scanner
        try (var sc = new Scanner(System.in)) {

            // 1. Get the first array
            System.out.print("Enter size of first array: ");
            var size1 = sc.nextInt();
            var arr1 = new int[size1];
            System.out.println("Enter " + size1 + " numbers:");
            for (var i = 0; i < size1; i++) {
                arr1[i] = sc.nextInt();
            }

            // 2. Get the second array
            System.out.print("Enter size of second array: ");
            var size2 = sc.nextInt();
            var arr2 = new int[size2];
            System.out.println("Enter " + size2 + " numbers:");
            for (var i = 0; i < size2; i++) {
                arr2[i] = sc.nextInt();
            }

            // 3. Merge and sort using Streams
            var merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                    .sorted()
                    .toArray();

            // 4. Print the result
            System.out.println("Merged Array: " + Arrays.toString(merged));
        }
    }
}
