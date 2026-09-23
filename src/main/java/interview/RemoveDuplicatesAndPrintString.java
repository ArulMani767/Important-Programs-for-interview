package interview;

import java.util.*;

public class RemoveDuplicatesAndPrintString {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            var s = sc.nextLine();
            var result = new StringBuilder();
            for (var i = 0; i < s.length(); i++) {
                var ch = s.charAt(i);
                if (result.indexOf(String.valueOf(ch)) == -1) {
                    result.append(ch);
                }
            }
            System.out.println("Original: " + s);
            System.out.println("Without duplicates: " + result.toString());
        }
    }
}

