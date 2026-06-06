public class P17_Null_Handling_in_Pattern_Matching_java_21 {
    public static void main(String[] args) {
        Object obj = null;
        String result = switch (obj) {
            case null -> "Value is null";
            default -> "Not null";
        };
        System.out.println(result);
    }
}
