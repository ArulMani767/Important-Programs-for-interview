import java.util.Scanner;
import java.util.stream.IntStream;
public class P02_Inverted_Triangle_using_streams {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            var n = sc.nextInt();
            IntStream.rangeClosed(1, n)
                .mapToObj(i -> "*".repeat(n - i))
                .forEach(System.out::println);
        }
    }
}
