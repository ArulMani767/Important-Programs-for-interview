package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationOfString {

    // input string = "JSP";
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            var str = sc.nextLine();
           var ch= str.toCharArray();

            var perms = List.of(""); // Java 9+ immutable list initialization

            for (char c : ch) {
                var nextPerms = new ArrayList<String>();
                for (var s : perms) {
                    for (int i = 0; i <= s.length(); i++) {
                        nextPerms.add(s.substring(0, i) + c + s.substring(i));
                    }
                }
                perms = nextPerms;
            }

            perms.forEach(System.out::println);
        }
    }

}