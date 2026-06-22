package com.interview;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        
        // Reverse and print the string using StringBuilder
        System.out.println("Reversed string: " + new StringBuilder(input).reverse());
    }
    }
}

