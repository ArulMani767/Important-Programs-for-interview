import java.util.*;
import java.util.stream.*;
public class CountOccurencesOfEachCharactersInString {
    public static void main(String[] args) {
        String inputString = "hello";
        var charCounts = inputString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c 
-> c, Collectors.counting()));
        System.out.println(charCounts);
    }
}
