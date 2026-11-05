package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationOfString {

    // input string = "JSP";
    private static void generate(char[] chars, int index) {

        if (index == chars.length) {
            System.out.println(String.valueOf(chars));
            return;
        }

        for (var i = index; i < chars.length; i++) {

            var temp = chars[index];
            chars[index] = chars[i];
            chars[i] = temp;

            generate(chars, index + 1);

            temp = chars[index];
            chars[index] = chars[i];
            chars[i] = temp;
        }

    }

    public static void main(String[] args) {

        try (var sc = new Scanner(System.in)) {

            System.out.print("Enter a string: ");
            var chars = sc.nextLine().trim().toCharArray();

            generate(chars, 0);
        }

    }
}