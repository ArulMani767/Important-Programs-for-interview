package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {
    //inputs
    //Hitler Woman  Mother In Lawl
    static void anagram(String s1, String s2) {
        var white = s1.replaceAll("\\s", "");
        var white2 = s2.replaceAll("\\s", "");

        var status = true;

        if (white.length() != white2.length()) {
            status = false;
        } else {
            var chararray = white.toLowerCase().toCharArray();
            var chararray2 = white2.toLowerCase().toCharArray();
            Arrays.sort(chararray);
            Arrays.sort(chararray2);

            status = Arrays.equals(chararray, chararray2);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " not anagrams");
        }
    }

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter first string:");
            var first = sc.nextLine();
            System.out.println("Enter second string:");
            var second = sc.nextLine();
            anagram(first, second);
        }
    }
}

