package com.interview;

import java.util.Arrays;
import java.util.*;

public class MergeTwoUnSortedArraysInSortedOrder {
	//input 
	//{ 27, 8, 71, -9, 18 } first
	//{ 12, -7, 18, 9, 37, -1, 21 } second
	private static int[] mergeArray(int[] a, int[] b) {
		int[] mergedarray = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length) {
			mergedarray[k] = a[i];
			i++;
			k++; 
		}
		while (j < b.length) {
			mergedarray[k] = b[j];
			j++;
			k++;
		}
		Arrays.sort(mergedarray);
		return mergedarray;

	}

	public static void main(String[] args) {
		try (var sc = new Scanner(System.in)) {
            
            // 1. Gather the first array input
            System.out.print("Enter the size of the first array: ");
            var size1 = sc.nextInt();
            var first = new int[size1];
            System.out.println("Enter " + size1 + " integers for the first array:");
            for (var m = 0; m < size1; m++) {
                first[m] = sc.nextInt();
            }

            // 2. Gather the second array input
            System.out.print("Enter the size of the second array: ");
            var size2 = sc.nextInt();
            var second = new int[size2];
            System.out.println("Enter " + size2 + " integers for the second array:");
            for (var n = 0; n < size2; n++) {
                second[n] = sc.nextInt();
            }

            // 3. Process and display using your original logic flow
            var merged = mergeArray(first, second);
            
            System.out.println("First:" + Arrays.toString(first));
            System.out.println("Second:" + Arrays.toString(second));
            System.out.println("Merged:" + Arrays.toString(merged));
        }

	}

}

