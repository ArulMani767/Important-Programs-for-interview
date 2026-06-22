public class ReverseEachWordInString {
    public static void main(String[] args) {
        String input = "Java programming";
        for (String w : input.split(" ")) {
            System.out.print(new StringBuilder(w).reverse() + " ");
        }
    }
}
