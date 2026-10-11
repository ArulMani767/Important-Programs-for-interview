package interview;

import java.util.*;

public class AnagramProgram {
    // inputs
    // Hitler Woman Mother In Law

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter first string:");
            var first = sc.nextLine();

            System.out.println("Enter second string:");
            var second = sc.nextLine();

            // Strip spaces and convert to lowercase
            var white = first.replaceAll("\\s", "").toLowerCase();
            var white2 = second.replaceAll("\\s", "").toLowerCase();

            boolean status;

            if (white.length() != white2.length()) {
                status = false;
            } else {
                var charArray1 = white.toCharArray();
                var charArray2 = white2.toCharArray();

                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                status = Arrays.equals(charArray1, charArray2);
            }

            if (status) {
                System.out.println(first + " and " + second + " are anagrams");
            } else {
                System.out.println(first + " and " + second + " are not anagrams");
            }
        }
    }

}
