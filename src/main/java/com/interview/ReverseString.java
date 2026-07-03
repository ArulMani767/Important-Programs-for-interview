package com.interview;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the String");
            var input = sc.nextLine();
            // I was writing this line because of it is mutable if we put String output="";
            // like this it will be immutable
            // we use string builder because it is mutable
            var output = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                output.append(input.charAt(i));
            }
            System.out.println(output);
        }
    }
}

