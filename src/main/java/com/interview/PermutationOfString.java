package com.interview;

public class PermutationOfString {

    public static void StringPermutation(String input) {
        StringPermutation("", input);
    }

    private static void StringPermutation(String permutation, String input) {
        if (input.isEmpty()) { // input.length() == 0 updated to input.isEmpty() for clarity
            System.out.println(permutation);
        } else {
            for (var i = 0; i < input.length(); i++) {
                // UNCHANGED RECURSIVE LOGIC: Extracts character at index i and combines
                // remaining pieces
                StringPermutation(
                        permutation + input.charAt(i),
                        input.substring(0, i) + input.substring(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        StringPermutation("JSP");
    }

}
