package interview;
import java.util.Scanner;

public class CapitalizeWords {

    public static void main(String[] args) {

        try (var sc = new Scanner(System.in)) {

            System.out.print("Enter a string: ");

            var input = sc.nextLine();

            var words = input.split("\\s+");

            var result = new StringBuilder();

            for (var word : words) {

                if (!word.isEmpty()) {

                    result.append(Character.toUpperCase(word.charAt(0)))

                            .append(word.substring(1).toLowerCase())

                            .append(" ");

                }

            }

            // Trim the trailing space

            System.out.println(result.toString().trim());

        }

    }

}