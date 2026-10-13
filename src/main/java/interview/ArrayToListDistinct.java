package interview;

import java.util.*;

public class ArrayToListDistinct {
    // input 1 2 2 3 4 4 5
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter elements for the first array separated by spaces:");
            var input1 = sc.nextLine();
            var arr = input1.trim().split("\\s+");
            var list = Arrays.asList(arr);
            var uniqueList = list.stream().distinct().toList();
            System.out.println("List without duplicates: " + uniqueList);

            // for hardcoded string array use this code
            /*
             * String [] input = {"apple", "banana", "orange", "grapes", "apple", "orange",
             * "apple"};
             * 
             * var list = new ArrayList<>(Arrays.asList(input));
             * 
             * var count=
             * list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
             * 
             * var duplicates= list.stream().distinct().collect(Collectors.toList());
             * 
             * System.out.println(count);
             * System.out.println(duplicates);
             */

        }
    }
}
