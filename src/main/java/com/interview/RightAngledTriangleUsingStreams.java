package com.interview;

import java.util.Scanner;
import java.util.stream.IntStream;

public class RightAngledTriangleUsingStreams {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            var n = sc.nextInt();
            IntStream.rangeClosed(1, n)
                    .mapToObj(i -> "*".repeat(i))
                    .forEach(System.out::println);
        }
    }
}

