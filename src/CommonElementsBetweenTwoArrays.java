import java.util.*;
import java.util.stream.*;
public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        var s1 = new String[]{"one", "Two", "Three"};
        var s2 = new String[]{"Three", "Four"};
        var set2 = Set.of(s2);
        var commonElements = Arrays.stream(s1).filter(set2::contains).collect(Collectors.toSet());
        System.out.println(commonElements);
    }
}
