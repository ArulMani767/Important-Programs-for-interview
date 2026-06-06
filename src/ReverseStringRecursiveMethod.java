
public class ReverseStringRecursiveMethod {

    public static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String original = "Tiruchendur";
        String reversed = reverse(original);
        System.out.println(original);
        System.out.println(reversed);
    }

}
