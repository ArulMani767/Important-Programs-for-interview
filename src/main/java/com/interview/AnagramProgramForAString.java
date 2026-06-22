import java.util.Arrays;

public class AnagramProgramForAString {
    static void anagram(String s1, String s2) {
        var white = s1.replaceAll("\\s", "");
        var white2 = s2.replaceAll("\\s", "");
        if (white.length() != white2.length()) {
            System.out.println("not anagrams");
        } else {
            var c1 = white.toLowerCase().toCharArray();
            var c2 = white2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if (Arrays.equals(c1, c2)) {
                System.out.println("anagrams");
            }
        }
    }
}
