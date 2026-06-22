package com.interview;

public class NullHandlingInPatternMatchingJava21 {
    public static void main(String[] args) {
        Object obj = null;
        String result = switch (obj) {
            case null -> "Value is null";
            default -> "Not null";
        };
        System.out.println(result);
    }
}

