package interview;

import java.util.Scanner;

public class SwapTwoNumbersWithoutTemp {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter first number (a): ");
            var a = sc.nextInt();

            System.out.print("Enter second number (b): ");
            var b = sc.nextInt();

            System.out.println("Before: a=" + a + ", b=" + b);

            // Swap without temporary variable
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After: a=" + a + ", b=" + b);
        }
    }
}
