import java.util.*;
import java.util.stream.*;

public class RemoveDuplicatesFromStringPrintDuplicatesAndCount {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the string to count");
            var input = sc.nextLine();
            var charcount = input.chars().mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

            System.out.println(charcount);

            var duplicatecount = charcount.entrySet().stream().filter(entry -> entry.getValue() > 1)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            System.out.println(duplicatecount);

        }
    }
}
