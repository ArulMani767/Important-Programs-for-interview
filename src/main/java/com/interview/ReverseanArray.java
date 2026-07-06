package com.interview;

import java.util.*;

public class ReverseanArray {
	
	public static void main(String[] args) {
		try (var sc = new Scanner(System.in)) {
            System.out.println("Enter elements for the first array separated by spaces:");
            var input1 = sc.nextLine();
            var arr = input1.trim().split("\\s+");
	        // Using StringBuilder because it is mutable, just like your ReverseString example
	        var result = new StringBuilder();

	        for (var element : arr) {
	            // Logic: Only append the element if it's not already in our result string
	            // This mirrors the 'if (result.indexOf(...) == -1)' logic 
	            if (result.indexOf(element) == -1) {
	                result.append(element).append(" ");
	            }
	        }

	        System.out.println("\nArray elements without duplicates:");
	        System.out.println(result.toString().trim());
	    }
	}

}

