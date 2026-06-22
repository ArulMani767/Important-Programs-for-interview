package com.interview;

import java.util.Scanner;

public class ReverseEachWordInString {
    public static void main(String[] args) {

        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            var input = sc.nextLine();

            // UNCHANGED LOGIC: Your exact for-each loop and printing steps
            for (String w : input.split(" ")) {
                System.out.print(new StringBuilder(w).reverse() + " ");
            }
        }
    }
}
