import java.util.*;
import java.util.stream.*;

public class CountOccurencesOfEachCharactersInArray {
    public static void main(String[] args) {
        String[] array = { "A", "B", "A" };
        var occurrences = Arrays.stream(array).collect(Collectors.groupingBy(e -> e,
                Collectors.counting()));
        System.out.println(occurrences);
    }
}
