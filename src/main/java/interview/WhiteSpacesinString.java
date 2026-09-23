package interview;

import java.util.*;

public class WhiteSpacesinString {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter a string with whitespaces: ");
            var input = sc.nextLine();
            var ch = input.toCharArray();
            var output = new StringBuilder();

            // Loop through the input to filter out spaces and tabs
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] != ' ' && ch[i] != '\t') {
                    output.append(ch[i]);
                }
            }

            System.out.println("String without whitespace: " + output);
        }
    }
}


