package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationOfString {

    // input string = "JSP";

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter a string to find all its permutations:");
            var input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Input cannot be empty.");
                return;
            }

            System.out.println("\nPermutations:");

            List<String> permutations = new ArrayList<>();
            permutations.add(""); // start with one empty permutation

            for (var i = 0; i < input.length(); i++) {
                var currentChar = input.charAt(i);
                List<String> next = new ArrayList<>();

                for (var perm : permutations) {
                    // insert currentChar into every possible position of perm
                    for (var pos = 0; pos <= perm.length(); pos++) {
                        var newPerm = perm.substring(0, pos) + currentChar + perm.substring(pos);
                        next.add(newPerm);
                    }
                }
                permutations = next;
            }

            for (var perm : permutations) {
                System.out.println(perm);
            }
        }
    }
}
