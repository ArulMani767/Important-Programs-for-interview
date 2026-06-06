import java.util.*;
import java.util.stream.*;
public class P27_Find_Duplicate_Words_in_a_String {
    public static void main(String[] args) {
        String input = "java is fun and java is fast";
        Map<String, Long> wordCount = Arrays.stream(input.split("\s+")).collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        Map<String, Long> duplicates = wordCount.entrySet().stream().filter(e -> e.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(duplicates);
    }
}
