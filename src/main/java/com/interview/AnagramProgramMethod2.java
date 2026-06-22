package com.interview;

import java.util.Arrays;
public class AnagramProgramMethod2 {
    static void check(String s1, String s2) {
        char[] c1 = s1.toCharArray(); Arrays.sort(c1);
        char[] c2 = s2.toCharArray(); Arrays.sort(c2);
        System.out.println(Arrays.equals(c1, c2));
    }
}

