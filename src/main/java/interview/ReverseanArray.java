package interview;

import java.util.*;

public class ReverseanArray {

	public static void main(String[] args) {
		try (var sc = new Scanner(System.in)) {
			System.out.println("enter the array to reverse elements"); // Fixed description
			var input = sc.nextLine();
		    var arr=input.toCharArray();
			var result = new StringBuilder();

			// FIX: Loop backwards through the array to build the reversed string
			for (int i = arr.length - 1; i >= 0; i--) {
				result.append(arr[i]).append(" ");
			}

			System.out.println("Array after reverse");
			System.out.println(result.toString().trim());
		}
	}


	/*int[] arr = {10, 20, 30, 40, 50};
        
        var result = new StringBuilder();

        // The exact same loop works for int[]
        for (int i = arr.length - 1; i >= 0; i--) {
            result.append(arr[i]).append(" ");
        }

        System.out.println("Integer Array after reverse:");
        System.out.println(result.toString().trim());  */


	/*	String[] arr = {"apple", "banana", "orange", "grapes"};
        
        var result = new StringBuilder();

        // The exact same loop works for String[]
        for (int i = arr.length - 1; i >= 0; i--) {
            result.append(arr[i]).append(" ");
        }

        System.out.println("String Array after reverse:");
        System.out.println(result.toString().trim()); */





}
