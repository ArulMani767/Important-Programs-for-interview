import java.util.*;
import java.util.stream.*;
public class P13_count_no_of_words_in_a_string_No_length_method {
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
