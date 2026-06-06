import java.util.*;
import java.util.stream.*;
public class P35_DuplicateCharactersInAString {
    public static void main(String[] args) {
        String s = "hello";
        var counts = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, 
Collectors.counting()));
        counts.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
    }
}
