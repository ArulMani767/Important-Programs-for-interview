package com.interview;

import java.util.Arrays;
import java.util.Scanner;

//Enter the size of the array: 5
// Enter 5 array elements (separated by spaces or lines):
// 5 3 8 1 2
// input array :[5, 3, 8, 1, 2]
// sorted array :[1, 2, 3, 5, 8]

public class BubbleSortAlgorithm {
	static int[] bubblesort(int[] input) {
		var temp = 0;
		for (var i = 0; i < input.length - 1; i++) {
			for (var j = 0; j < input.length - i - 1; j++) {
				if (input[j] > input[j + 1]) {
					temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;

				}
			}
		}
		return input;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the size of the array: ");
			var size = sc.nextInt();

			var input = new int[size];
			System.out.println("Enter " + size + " array elements (separated by spaces or lines):");
			for (var i = 0; i < size; i++) {
				input[i] = sc.nextInt();
			}

			System.out.println("input array :" + Arrays.toString(input));
			var sortedarray = bubblesort(input);
			System.out.println("sorted array :" + Arrays.toString(sortedarray));
		}
	}
}
