package com.interview;

import java.util.*;

public class WhiteSpacesinString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string with whitespaces: ");
            String input = scanner.nextLine();
            char[] ch = input.toCharArray();
            StringBuilder output = new StringBuilder();

            // Loop through the input to filter out spaces and tabs
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] != ' ' && ch[i] != '\t') {
                    output.append(ch[i]);
                }
            }

            System.out.println("String without whitespace: " + output);
        }
    }
}


