import java.util.*;
import java.util.stream.*;
public class DiamondStarPattern {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the rows to print: ");
            var n = sc.nextInt();
            // upper half — increasing
            IntStream.rangeClosed(1, n)
                .mapToObj(i -> " ".repeat(n - i)
                + "*".repeat(2 * i - 1))
                .forEach(System.out::println);
            // lower half — decreasing
            IntStream.iterate(n - 1, i -> i - 1)
                .limit(n - 1)
                .mapToObj(i -> " ".repeat(n - i)
                + "*".repeat(2 * i - 1))
                .forEach(System.out::println);
        }
    }
}
