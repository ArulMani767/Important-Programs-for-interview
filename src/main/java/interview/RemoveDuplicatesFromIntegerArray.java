package interview;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicatesFromIntegerArray {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 1, 2 };

        // 1. IntStream.of() creates the stream directly from the array
        // 2. .distinct() filters out duplicates
        // 3. .toArray() collects the result back into a primitive int[] array without
        // boxing
        int[] uniqueNumbers = IntStream.of(input)
                .distinct()
                .toArray();

        System.out.println(Arrays.toString(uniqueNumbers)); // Output: [1, 2, 3, 4, 5]

        // alternative way to create the stream using Arrays.stream()

        // int [] input = {1,2,3,4,5,1,2};

        // var duplicates=
        // Arrays.stream(input).boxed().distinct().collect(Collectors.toList());

        // System.out.println(duplicates);



        /*int[] input = {1, 2, 3, 4, 5, 1, 2};
        
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();
        
        for (int num : input) {
            // Sets automatically reject duplicate values
            uniqueSet.add(num); 
        }

        System.out.println(uniqueSet); // Output: [1, 2, 3, 4, 5] */
    }
}
