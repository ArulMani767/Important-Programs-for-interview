package com.interview;

import java.util.*;
import java.util.stream.*;

public class PrintCommonCharactersBetweenTwoStringsAlphabeticalOrder {

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter two input strings :");
            var firstString = sc.nextLine();
            var secondString = sc.nextLine();

            // 1. Map clean strings to sorted TreeSets using Streams
            var firstSet = firstString.replaceAll("\\s+", "").chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toCollection(TreeSet::new));

            var secondSet = secondString.replaceAll("\\s+", "").chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toCollection(TreeSet::new));

            // 2. Intersect the collections
            firstSet.retainAll(secondSet);

            // 3. Output results
            System.out.println("Common characters in alphabetical order : " + firstSet);
            System.out.println("Count : " + firstSet.size());
        }
    }
}