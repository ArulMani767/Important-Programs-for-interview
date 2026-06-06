import java.util.*;
public class RemoveVowelsInString {
    public static void main(String[] args) {
        String s = "Education";
        System.out.println(s.replaceAll("[AEIOUaeiou]", ""));
    }
}
