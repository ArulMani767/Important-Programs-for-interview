package interview;

import java.util.*;

// input 
// first array a a b b c c
//second array b b c c d d
public class CommonCharactersBetweenTwoStringArrays {

    // actually intersection of arrays and common elements between arrays are the same thing, but the naming is different.
    public static void main(String[] args) {

        try (var sc = new Scanner(System.in)) {
            // Take input for the first array
            System.out.println("Enter elements for the first array (separated by spaces):");
            var input1 = sc.nextLine();
            var s1 = input1.trim().split("\\s+");

            // Take input for the second array
            System.out.println("Enter elements for the second array (separated by spaces):");
            var input2 = sc.nextLine();
            var s2 = input2.trim().split("\\s+");

            var set = new HashSet<String>();

            // UNCHANGED LOGIC: Your exact nested loops
            for (var i = 0; i < s1.length; i++) {
                for (var j = 0; j < s2.length; j++) {
                    if (s1[i].equals(s2[j])) {
                        set.add(s1[i]);
                    }
                }
            }

            System.out.println(set);
        }

    }
}
