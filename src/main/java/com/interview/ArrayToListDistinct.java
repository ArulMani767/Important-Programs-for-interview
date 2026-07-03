package com.interview;

import java.util.*;
import java.util.Arrays;

public class ArrayToListDistinct {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter size of array:");
            var n = sc.nextInt();
            sc.nextLine();
            var arr = new String[n];
            for (var i = 0; i < n; i++) {
                arr[i] = sc.nextLine();
            }
            var list = Arrays.asList(arr);
            var uniqueList = list.stream().distinct().toList();
            System.out.println("List without duplicates: " + uniqueList);
        }
    }
}

