import java.util.*;
import java.util.stream.*;
public class P38_MaxOccuringCharactersInAString {
    public static void main(String[] args) {
        String input = "java";
        var counts = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, 
Collectors.counting()));
        var max = counts.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
        System.out.println(max.getKey());
    }
}
