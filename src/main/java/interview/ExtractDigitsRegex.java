package interview;

public class ExtractDigitsRegex {
    public static void main(String[] args) {
        String input = "a1b2c3";

        // The regex "\\D" matches any character that is NOT a decimal digit.
        // Replacing all non-digits with an empty string leaves only the numbers.
        String numericOnly = input.replaceAll("\\D", "");

        System.out.println(numericOnly);
    }
}
