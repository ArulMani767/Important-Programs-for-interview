import java.util.*;
import java.util.stream.*;
public class CountNoOfWordsInAStringNoLengthMethod {
    public static void main (String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("enter the String");
            var input = sc.nextLine();
            var count = 0;
            for (var i = 0; i <= 0; i++) {
                var ch = input.toCharArray();
                for (var c : ch) { count++; }
                System.out.println(count);
            }
        }
    }
}
