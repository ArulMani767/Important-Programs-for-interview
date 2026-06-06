import java.util.Scanner;
import java.util.stream.IntStream;
public class P11_StringLengthWithoutLength {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            var str = sc.nextLine();
            var count = 0;
            for (var c : str.toCharArray()) { count++; }
            var count_val = str.chars().count();
            System.out.println("Length of the string: " + count_val);
        }
    }
}
