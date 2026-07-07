package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        for (var i = 0; i < arr.length - 1; i++) {
            var pos = i;
            for (var j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[pos]) < 0) {
                    pos = j;
                }
            }
            T temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter elements to sort separated by spaces:");
            var inputLine = sc.nextLine().trim();
            var tokens = inputLine.split("\\s+");

            // Check if the first element is a number
            if (tokens[0].matches("-?\\d+")) {
                // If it's a number, convert to an Integer[] Object array to sort numerically
                Integer[] intArray = Arrays.stream(tokens)
                        .map(Integer::valueOf)
                        .toArray(Integer[]::new);

                selectionSort(intArray); // Works because Integer implements Comparable
                System.out.println("Sorted Integers: " + Arrays.toString(intArray));
            } else {
                // Otherwise, treat it as a String[] array to sort alphabetically
                var lowercaseArray = Arrays.stream(tokens)
                               .map(String::toLowerCase)
                               .toArray(String[]::new);
                selectionSort(lowercaseArray); // Works because String implements Comparable
                System.out.println("Sorted Strings: " + Arrays.toString(lowercaseArray));
            }
        }
    }
}
