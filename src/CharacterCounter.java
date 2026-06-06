import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
public class CharacterCounter {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            var inputString = sc.nextLine();
            var charCounts = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
            System.out.println("Character counts: " + charCounts);
        }
    }
}
