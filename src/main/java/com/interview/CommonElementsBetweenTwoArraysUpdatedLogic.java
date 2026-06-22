package com.interview;

import java.util.*;
import java.util.stream.Collectors;

public class CommonElementsBetweenTwoArraysUpdatedLogic {
    public static void main(String[] args) {
        String[] s1 = { "one", "Two" }, s2 = { "Two", "Six" };
        var set2 = Set.of(s2);
        var common = Arrays.stream(s1).filter(set2::contains).collect(Collectors.toSet());
        System.out.println(common);
    }
}

