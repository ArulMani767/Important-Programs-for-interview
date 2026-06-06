import java.util.stream.*;
import java.util.*;

public class RemoveDuplicatesFoundInStringPrintWithoutDuplicatesAndCountJava8 {
    public static void main(String[] args) {
        String input = "java";
        String unique = input.chars().mapToObj(c -> String.valueOf((char) c)).distinct().collect(Collectors.joining());
        Map<Character, Long> counts = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        System.out.println(unique);
    }
}
