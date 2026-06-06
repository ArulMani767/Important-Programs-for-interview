import java.util.stream.*;
import java.util.*;
public class P04_Left_angled_Triangle_Using_Streams {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows to print: ");
            var n = sc.nextInt();
            IntStream.rangeClosed(1, n)
                .mapToObj(i -> " ".repeat(n - i)
                + "*".repeat(i))
                .forEach(System.out::println);
        }
    }
}
