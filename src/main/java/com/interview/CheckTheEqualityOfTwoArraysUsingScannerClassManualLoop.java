package com.interview;


public class CheckTheEqualityOfTwoArraysUsingScannerClassManualLoop {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3 }, a2 = { 1, 2, 3 };
        boolean equal = true;
        if (a1.length == a2.length) {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    equal = false;
                    break;
                }
            }
        }
        System.out.println(equal);
    }
}

