package com.interview;

import java.util.stream.*;
import java.util.Set;

public class CommonCharactersBetweenTwoStrings {
    public static void main(String[] args) {
        String s1 = "apple", s2 = "orange";
        Set<Character> firstSet = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        var commonChars = s2.chars().mapToObj(c -> (char) c).filter(firstSet::contains).collect(Collectors.toSet());
        System.out.println(commonChars);
    }
}

