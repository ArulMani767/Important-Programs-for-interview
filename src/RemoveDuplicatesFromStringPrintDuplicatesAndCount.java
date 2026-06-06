import java.util.*;
import java.util.stream.*;
public class RemoveDuplicatesFromStringPrintDuplicatesAndCount {
    public static void main(String[] args) {
        String input = "hello";
        Map<Character, Long> counts = input.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
        Map<Character, Long> duplicates = counts.entrySet().stream().filter(e -> e.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(duplicates);
    }
}
