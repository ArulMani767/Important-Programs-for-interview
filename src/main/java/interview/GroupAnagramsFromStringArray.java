package interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GroupAnagramsFromStringArray {
    public static void main(String[] args) {
        String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };

        // Group words by their sorted character string key (e.g., "eat" -> "aet")
        var groups = Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> {
                    var chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }))
                .values();

        System.out.println("Grouped Anagrams: " + groups);
    }
}
