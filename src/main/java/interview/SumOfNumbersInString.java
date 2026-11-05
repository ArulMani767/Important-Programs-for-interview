package interview;

import java.util.Arrays;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        var input = "qa12auto30test8";

        // Split by one or more non-digits ("\\D+") and sum the numbers
        var sum = Arrays.stream(input.split("\\D+"))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println("Sum of numbers: " + sum); // 50
    }
}
