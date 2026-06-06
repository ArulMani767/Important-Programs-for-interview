import java.util.Scanner;
import java.util.stream.*;
public class P01_Pyramid_Program_using_streams {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            var n = sc.nextInt();
            IntStream.rangeClosed(1, n)
                .mapToObj(i -> " ".repeat(n - i)
                + "*".repeat(2 * i - 1))
                .forEach(System.out::println);
        }
    }
}
