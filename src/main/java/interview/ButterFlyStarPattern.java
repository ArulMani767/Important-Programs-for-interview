package interview;

import java.util.*;
import java.util.stream.*;

public class ButterFlyStarPattern {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the rows to print: ");
            var n = sc.nextInt();
            // upper half — increasing
            IntStream.rangeClosed(1, n)
                    .mapToObj(i -> "*".repeat(i)
                            + " ".repeat(2 * (n - i))
                            + "*".repeat(i))
                    .forEach(System.out::println);
            // lower half — decreasing
            IntStream.iterate(n, i -> i - 1)
                    .limit(n - 1)
                    .mapToObj(i -> "*".repeat(i)
                            + " ".repeat(2 * (n - i))
                            + "*".repeat(i))
                    .forEach(System.out::println);
        }
    }
}

