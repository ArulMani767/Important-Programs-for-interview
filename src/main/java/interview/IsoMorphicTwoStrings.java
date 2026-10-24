package interview;

import java.util.Scanner;

public class IsoMorphicTwoStrings {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter first string: ");
            var s1 = sc.nextLine();

            System.out.print("Enter second string: ");
            var s2 = sc.nextLine();

            if (s1.length() != s2.length()) {
                System.out.println("Not Isomorphic: Lengths are different.");
                return;
            }

            var isIsomorphic = true;

            for (var i = 0; i < s1.length(); i++) {
                // If both characters first appeared at different positions, the mapping is
                // broken
                if (s1.indexOf(s1.charAt(i)) != s2.indexOf(s2.charAt(i))) {
                    isIsomorphic = false;
                    break;
                }
            }

            if (isIsomorphic) {
                System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are Isomorphic.");
            } else {
                System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are Not Isomorphic.");
            }
        }
    }
}
