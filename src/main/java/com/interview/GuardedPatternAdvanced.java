public class GuardedPatternAdvanced {
    public static void main(String[] args) {
        Object obj = 150;
        String result = switch (obj) {
            case Integer i when i > 100 -> "Large number";
            case Integer i -> "Small number";
            default -> "Not an integer";
        };
        System.out.println(result);
    }
}
