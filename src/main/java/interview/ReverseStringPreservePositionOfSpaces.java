package interview;

import java.util.*;

public class ReverseStringPreservePositionOfSpaces {

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("enter the string");
            var input = sc.nextLine();

            var ch = input.toCharArray();

            // Step 1: Extract only the non-space characters in reverse order
            var nonSpaceReversed = new StringBuilder();
            for (int i = ch.length - 1; i >= 0; i--) {
                if (ch[i] != ' ') {
                    nonSpaceReversed.append(ch[i]);
                }
            }

            // Step 2: Rebuild the output string preserving space positions
            var output = new StringBuilder();
            int index = 0;

            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == ' ') {
                    output.append(' ');
                } else {
                    output.append(nonSpaceReversed.charAt(index++));
                }
            }

            System.out.println("Result: " + output);
        }
    }

}
