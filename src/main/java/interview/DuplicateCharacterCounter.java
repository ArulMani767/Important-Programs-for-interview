package interview;

import java.util.Map;
import java.util.stream.*;
import java.util.*;

public class DuplicateCharacterCounter {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            var inputString = sc.nextLine();
            var charCounts = inputString.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
            var duplicateChars = charCounts.entrySet().stream()
                    .filter(entry -> entry.getValue() > 1)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            System.out.println("Duplicate characters: " + duplicateChars);
        }
    }
}

