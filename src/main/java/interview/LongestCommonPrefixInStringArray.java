package interview;

import java.util.Arrays;

public class LongestCommonPrefixInStringArray {
    public static void main(String[] args) {
        String[] words = { "flower", "flow", "flight" };

        // Sort alphabetically so we only compare the first and last strings
        Arrays.sort(words);
        var first = words[0];
        var last = words[words.length - 1];

        var i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        System.out.println("Longest Common Prefix: '" + first.substring(0, i) + "'"); // 'fl'
    }
}
