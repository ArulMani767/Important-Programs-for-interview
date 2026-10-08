package interview;

public class RemoveWhiteSpacesinStringAndIndex {
    public static void main(String[] args) {

        String input = "Automation Test Engineer";
        char[] ch = input.toCharArray();
        var output = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ' && ch[i] != '\t') {
                output.append(ch[i]);
            }

        }

        System.out.println(output);

        for (int i = 0; i < output.length(); i++) {
            System.out.println(i + "->" + output.charAt(i));
        }
    }

}
