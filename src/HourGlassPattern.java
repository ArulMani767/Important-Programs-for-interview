import java.util.*;
import java.util.stream.*;
public class HourGlassPattern {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the rows to print: ");
            var n = sc.nextInt();
            // upper half — decreasing
            IntStream.iterate(n, i -> i - 1)
                .limit(n - 1)
                .mapToObj(i -> " ".repeat(n - i)
                + "*".repeat(2 * i - 1))
                .forEach(System.out::println);
            // lower half — increasing
            IntStream.rangeClosed(2, n)
                .mapToObj(i -> " ".repeat(n - i)
                + "*".repeat(2 * i - 1))
                .forEach(System.out::println);
        }
    }
}
