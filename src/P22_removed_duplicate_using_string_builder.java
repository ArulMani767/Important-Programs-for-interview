public class P22_removed_duplicate_using_string_builder {
    public static void main(String[] args) {
        String input = "aapppllllee";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (result.indexOf(String.valueOf(ch)) == -1) { result.append(ch); }
        }
        System.out.println(result);
    }
}
