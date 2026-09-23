package interview;

import java.util.*;
import java.util.TreeSet;

public class NthHighestNumberinArray {

    // inputs int[] arr = { -1, -1, -1, -1, -1, -3, 1, -2, -2, -2 };
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            var size = sc.nextInt();

            var arr = new int[size];
            System.out.println("Enter " + size + " integers:");
            for (var i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the value of N: ");
            var n = sc.nextInt();

            // CORE LOGIC: Add all elements to a TreeSet to auto-sort and remove duplicates
            var uniqueSortedElements = new TreeSet<Integer>();
            for (var num : arr) {
                uniqueSortedElements.add(num);
            }

            // Since it's sorted ascending, the Nth highest from the end
            // is exactly at position: (Total Unique Elements - N)
            var targetIndex = uniqueSortedElements.size() - n;

            if (targetIndex >= 0 && n > 0) {
                // Convert to an array to instantly grab the element at our target index
                var result = uniqueSortedElements.toArray()[targetIndex];
                System.out.println("The " + n + "th highest unique number is: " + result);
            } else {
                System.out.println("Error: Array does not contain " + n + " unique elements.");
            }
        }
    }
}
