package interview;

import java.util.*;

public class UniqueCharactersPresentInString {
    public static void main(String[] args) {
        String input = "aba";
        var len = input.length();
        
        // Compare the distinct count to the original length
        var isUnique = input.chars().distinct().count() == len;
        
        System.out.println("Is '" + input + "' unique? " + isUnique);


        // Another approach using a Set to check for uniqueness
        // var input = "abcd"; 
        // var isUnique = true;
        
        // var seen = new HashSet<Character>();
        
        // for (var c : input.toCharArray()) {
        //     if (!seen.add(c)) {
        //         isUnique = false;
        //         break;
        //     }
        // }
        
        // System.out.println("Is '" + input + "' unique? " + isUnique);
    }
}
