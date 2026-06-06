import java.util.Scanner;
import java.util.stream.IntStream;
public class P03_Right_angled_Triangle_using_Streams {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            var n = sc.nextInt();
            IntStream.rangeClosed(1, n)
                .mapToObj(i -> "*".repeat(i))
                .forEach(System.out::println);
        }
    }
}
