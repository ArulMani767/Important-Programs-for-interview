import java.util.*;
import java.util.stream.*;
public class P37_MaxOccuringCharactersInAArray {
    public static void main(String[] args) {
        String[] arr = {"a","b","a"};
        var counts = Arrays.stream(arr).collect(Collectors.groupingBy(e->e, Collectors.counting()));
        var max = counts.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(max.getKey());
    }
}
