package interview;

import java.util.Scanner;

public class TwoSumOfArrays {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {

            System.out.print("Enter the size of the array: ");
            var size = sc.nextInt();

            var arr = new int[size];
            System.out.println("Enter " + size + " integers:");
            for (var i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the target sum: ");
            var target = sc.nextInt();

            var found = false;

            for (var i = 0; i < arr.length; i++) {
                for (var j = 0; j < arr.length; j++) {
                    if (i != j && arr[i] + arr[j] == target) {
                        System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                        found = true;
                    }
                }
            }

            if (!found) {
                System.out.println("No pair found that adds up to " + target);
            }
        }
    }
}
