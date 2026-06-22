package com.interview;

import java.util.*;
public class AllPossibleSubstring {
    //input java
    static void subString(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                System.out.println(input.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
       try(var  sc = new Scanner(System.in)){
        System.out.println("enter the substring");
        String input = sc.nextLine();
        subString(input);
       }
    }
}

