package interview;

import java.util.Scanner;

public class GenerateSequenceInputs {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            for (int i = 0; i < 3; i++) {
                System.out.print(a + ", " + b);

                if (i < 2) {
                    System.out.print(", ");
                }

                a = a - 10;
                b = b + 10;
            }
        }
    }
}
