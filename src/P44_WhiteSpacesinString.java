public class P44_WhiteSpacesinString {
    public static void main(String[] args) {
        String input = "a b  c";
        String output ="";
        for(int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);
            if(ch!=' '&& ch!='\t') { output+=ch; }
        }
        System.out.println(output);
    }
}
