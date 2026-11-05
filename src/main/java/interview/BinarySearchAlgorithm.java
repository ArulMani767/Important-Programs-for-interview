package interview;

import java.util.Arrays;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        var target = 40;

        // Way 1 (Simplest): Built-in O(log n) Binary Search
        var index = Arrays.binarySearch(arr, target);
        System.out.println("Found at index: " + (index >= 0 ? index : -1));

        // Way 2 (Manual O(log n) Binary Search without built-in method):
        /*
        var low = 0;
        var high = arr.length - 1;
        var foundIndex = -1;

        while (low <= high) {
            var mid = (low + high) >>> 1; // Safe midpoint without overflow
            if (arr[mid] == target) {
                foundIndex = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Found at index: " + foundIndex);
        */
    }
}
