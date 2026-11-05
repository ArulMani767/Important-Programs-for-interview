package interview;

public class StringCompression {
    public static void main(String[] args) {
        var input = "aabcccccaaa";
        var sb = new StringBuilder();

        for (int i = 0; i < input.length();) {
            char ch = input.charAt(i);
            int count = 0;

            while (i < input.length() && input.charAt(i) == ch) {
                count++;
                i++;
            }

            sb.append(ch).append(count);
        }

        System.out.println(sb);
    }
}
