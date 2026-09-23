package interview;

import java.util.*;
import java.util.stream.IntStream;

public class MoveZerostoFirstOfArray {
    public static void main(String[] args) {
        // Try-with-resources automatically manages the scanner's lifecycle
        try (var sc = new Scanner(System.in)) {

            // 1. Input for the integer array using space-separated format
            System.out.println("Enter integer elements separated by spaces:");
            var inputLine = sc.nextLine();
            var arr = inputLine.trim().split("\\s+"); // Split the input string into an array of strings

            // Directly builds the primitive int[] array from the space-separated input
            // string
            int[] inputArray = Arrays.stream(arr)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // OPTIMIZED LOGIC: Pure stream pipeline to separate and join arrays
            // Step 1: Filter out all the zeros
            var zeros = Arrays.stream(inputArray).filter(num -> num == 0);

            // Step 2: Filter out all non-zero numbers
            var nonZeros = Arrays.stream(inputArray).filter(num -> num != 0);

            // Step 3: Glue them back together! Zeros go first, non-zeros go last.
            int[] result = IntStream.concat(zeros, nonZeros).toArray();

            System.out.println("Resulting Array: " + Arrays.toString(result));
        }
    }
}
