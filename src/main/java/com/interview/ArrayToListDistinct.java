package com.interview;

import java.util.*;

public class ArrayToListDistinct {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter elements for the first array separated by spaces:");
            var input1 = sc.nextLine();
            var arr = input1.trim().split("\\s+");
            var list = Arrays.asList(arr);
            var uniqueList = list.stream().distinct().toList();
            System.out.println("List without duplicates: " + uniqueList);
        }
    }
}

