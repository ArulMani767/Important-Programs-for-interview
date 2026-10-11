package interview;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {
    // inputs CSK MI CSK RCB MI CSK

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the elements (space-separated):");
            var inputLine = sc.nextLine();

            // 1. Separate line for array creation
            var arr = inputLine.trim().split("\\s+");

            // without scanner (hard coded) you need to boxed in the stream code

            // 2. Assign to ArrayList using Arrays.asList(arr)
            var originalList = new ArrayList<>(Arrays.asList(arr)); 
            //the above line it will not work for hardcoded integer array because Arrays.asList().

            // for hardcoded intger  use this code
            //int [] arr = { 1, 2, 3, 1, 2, 4, 1 };

            /*
             * var originalList = Arrays.stream(arr)
             * .boxed()
             * .collect(Collectors.toList());
             */

            // 3. Remove duplicates via Streams
            var uniqueList = originalList.stream()
                    .distinct()
                    .toList();

            // duplicates removed for hardcoded integer array use this code

            /*
             * var uniqueList = originalList.stream()
             * .distinct()
             * .toList();
             */

            System.out.println("Original ArrayList : " + originalList);
            System.out.println("Unique Elements    : " + uniqueList);
        }
    }
}
