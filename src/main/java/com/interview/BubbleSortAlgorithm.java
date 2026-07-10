package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortAlgorithm {
	static int[] bubblesort(int[] input) {
		int temp;
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - i - 1; j++) {
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
			int size = sc.nextInt();

			int[] input = new int[size];
			System.out.println("Enter " + size + " array elements (separated by spaces or lines):");
			for (int i = 0; i < size; i++) {
				input[i] = sc.nextInt();
			}

			System.out.println("input array :" + Arrays.toString(input));
			int[] sortedarray = bubblesort(input);
			System.out.println("sorted array :" + Arrays.toString(sortedarray));
		}
	}
}
