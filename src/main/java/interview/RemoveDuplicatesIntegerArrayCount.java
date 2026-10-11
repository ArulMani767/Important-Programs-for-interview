package interview;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicatesIntegerArrayCount {
    public static void main(String[] args) {
        // Hardcoded primitive integer array
        int[] input = { 1, 2, 3, 1, 2, 4, 1 };

        // Add .boxed() to convert IntStream to Stream<Integer>
        var elementCount = Arrays.stream(input).boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println("Element counts: " + elementCount);

        var duplicates = elementCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue));

        System.out.println("Duplicate elements: " + duplicates);
    }
}
