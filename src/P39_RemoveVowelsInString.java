import java.util.*;
public class P39_RemoveVowelsInString {
    public static void main(String[] args) {
        String s = "Education";
        System.out.println(s.replaceAll("[AEIOUaeiou]", ""));
    }
}
