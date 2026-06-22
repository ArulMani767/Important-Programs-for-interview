package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateAnArrayProgram {

// inputs    
 /*    Enter the size of the array: 5
Enter 5 integers for the array:
10 20 30 40 50
Enter the number of positions to left rotate (n): 2

Input Array Before Rotation :
[10, 20, 30, 40, 50]
Input Array After Left Rotation By 2 Positions :
[30, 40, 50, 10, 20] */
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void leftRotate(int[] inputArray, int n) {
        var len = inputArray.length;
        
        // Handle cases where n is greater than the array length
        n = n % len; 

        System.out.println("Input Array Before Rotation :");
        System.out.println(Arrays.toString(inputArray));
         
        // 1. Reverse the first 'n' elements
        reverse(inputArray, 0, n - 1);
        
        // 2. Reverse the rest of the elements
        reverse(inputArray, n, len - 1);
        
        // 3. Reverse the entire array
        reverse(inputArray, 0, len - 1);
         
        System.out.println("Input Array After Left Rotation By " + n + " Positions :");
        System.out.println(Arrays.toString(inputArray));
    }
     
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            var size = sc.nextInt();
            
            var array = new int[size];
            System.out.println("Enter " + size + " integers for the array:");
            for (var i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            System.out.print("Enter the number of positions to left rotate (n): ");
            var n = sc.nextInt();

            leftRotate(array, n);
        }
    }
}
