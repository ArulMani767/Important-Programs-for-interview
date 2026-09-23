package interview;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // inputs 153, 371, 407, 9474, 54748 are amstrong numbers
        int arm = 0, a, d, n;

        // Try-with-resources cleanly manages the scanner lifecycle
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Enter any number : ");
            n = scanner.nextInt();
            d = n;

            while (n > 0) {
                a = n % 10;
                arm = arm + (a * a * a);
                n = n / 10;
            }

            if (arm == d) {
                System.out.println("Armstrong number");
            } else {
                System.out.println("Not Armstrong number");
            }
        }
    }
}
