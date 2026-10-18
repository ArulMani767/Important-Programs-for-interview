package interview;

import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            var size = sc.nextInt();

            var arr = new int[size];
            System.out.println("Enter " + size + " numbers:");
            for (var i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            var isSorted = true;
            for (var i = 0; i < size - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    break;
                }
            }

            System.out.println(isSorted);
        }
    }
}
