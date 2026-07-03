package com.interview;

import java.util.*;

public class ReverseStringPreservePositionOfSpaces {

    static void reverseString(String inputString) {
        char[] arr = inputString.toCharArray();
        var left = 0;
        var right = arr.length - 1;

        // SIMPLIFIED LOOP
        while (left < right) {
            // Fast-forward 'left' past any spaces
            while (left < right && arr[left] == ' ') {
                left++;
            }
            // Fast-forward 'right' past any spaces
            while (left < right && arr[right] == ' ') {
                right--;
            }

            // If they haven't crossed paths, swap the non-space characters
            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(inputString + " ---> " + String.valueOf(arr));
    }

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter a string to reverse (keeping space positions):");
            var userInput = sc.nextLine();

            reverseString(userInput);
        }
    }

}
