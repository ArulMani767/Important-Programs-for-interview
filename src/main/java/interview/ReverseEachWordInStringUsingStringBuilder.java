package interview;

import java.util.*;

public class ReverseEachWordInStringUsingStringBuilder {
    public static void main(String[] args) {

        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            var input = sc.nextLine();
           var rev= input.split("\\s+");

            // UNCHANGED LOGIC: Your exact for-each loop and printing steps
            for (String w : rev) {
                System.out.print(new StringBuilder(w).reverse() + " ");
            }
        }
    }
}
