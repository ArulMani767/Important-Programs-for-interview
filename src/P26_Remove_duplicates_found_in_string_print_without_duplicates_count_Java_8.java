import java.util.stream.*;
import java.util.*;
public class P26_Remove_duplicates_found_in_string_print_without_duplicates_count_Java_8 {
    public static void main(String[] args) {
        String input = "java";
        String unique = input.chars().mapToObj(c -> String.valueOf((char) 
c)).distinct().collect(Collectors.joining());
        Map<Character, Long> counts = input.chars().mapToObj(c -> (char) 
c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        System.out.println(unique);
    }
}
