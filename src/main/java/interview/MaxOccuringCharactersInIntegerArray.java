package interview;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxOccuringCharactersInIntegerArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3 };

      var counts = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        var max = counts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println("Most frequent: " + max.getKey());
        System.out.println("Occurrences: " + max.getValue());
    }
}
