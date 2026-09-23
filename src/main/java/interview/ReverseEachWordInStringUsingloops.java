package interview;

import java.util.Scanner;

public class ReverseEachWordInStringUsingloops {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            var input = sc.nextLine();

            var result = new StringBuilder();
            var word = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c != ' ') {
                    word.append(c);
                } else {
                    // reverse the word manually, char by char
                    for (int j = word.length() - 1; j >= 0; j--) {
                        result.append(word.charAt(j));
                    }
                    result.append(' ');
                    word.setLength(0); // reset for next word
                }
            }

            // handle the last word (no trailing space after it)
            for (int j = word.length() - 1; j >= 0; j--) {
                result.append(word.charAt(j));
            }

            System.out.println(result.toString());
        }
    }
}
