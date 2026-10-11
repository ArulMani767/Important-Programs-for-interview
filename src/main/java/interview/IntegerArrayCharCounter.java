package interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class IntegerArrayCharCounter {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 1, 2, 4, 1 };

        // Add .boxed() to convert IntStream to Stream<Integer>
        var elementCount = Arrays.stream(input).boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println("Element counts: " + elementCount);
    }
}
