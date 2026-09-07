package com.interview;
import java.util.*;

public class SelectionSort {
   public static <T extends Comparable<T>> void selectionSort(T[] input) {
        int n = input.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                // Returns negative if input[j] is smaller than input[minIndex]
                if (input[j].compareTo(input[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            // In-place generic swap
            T temp = input[minIndex];
            input[minIndex] = input[i];
            input[i] = temp;
        }
    }

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter elements separated by spaces (numbers or words):");
            var line = sc.nextLine().trim();

            if (line.isEmpty()) {
                System.out.println("No input provided.");
                return;
            }

            var tokens = line.split("\\s+");

            // Check if the input consists of numbers or strings
            if (tokens[0].matches("-?\\d+")) {
                // Map tokens to Integer[] wrapper objects
                Integer[] numbers = Arrays.stream(tokens)
                        .map(Integer::valueOf)
                        .toArray(Integer[]::new);

                System.out.println("Original Integers: " + Arrays.toString(numbers));
                selectionSort(numbers);
                System.out.println("Sorted Integers:   " + Arrays.toString(numbers));
            } else {
                // Process directly as String[]
                System.out.println("Original Strings:  " + Arrays.toString(tokens));
                selectionSort(tokens);
                System.out.println("Sorted Strings:    " + Arrays.toString(tokens));
            }
        }
    }
}
