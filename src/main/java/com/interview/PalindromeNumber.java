import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        int number = scanner.nextInt();
        int originalNumber = number, reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
    }
}
