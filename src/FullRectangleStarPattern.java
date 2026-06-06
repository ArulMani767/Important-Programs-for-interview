import java.util.stream.*;
import java.util.*;
public class FullRectangleStarPattern {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows to print: ");
            var rows = sc.nextInt();
            System.out.println("Enter the number of columns to print: ");
            var col = sc.nextInt();
            IntStream.rangeClosed(1, rows)
                .mapToObj(i -> "*".repeat(col))
                .forEach(System.out::println);
        }
    }
}
