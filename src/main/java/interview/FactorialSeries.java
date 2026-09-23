package interview;

import java.util.Scanner;

public class FactorialSeries {
    //1, 2, 6, 24, 120, 720
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("enter the number of terms");
            var n = sc.nextInt();

            System.out.println("factorial series");

            var fact = 1;
            for (var i = 1; i <= n; i++) {
                fact = fact * i;
                System.out.print(fact + " ");
            }
        }
    }
}
