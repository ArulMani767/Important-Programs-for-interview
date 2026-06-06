import java.util.stream.*;
import java.util.Scanner;
import java.util.Set;


public class CommonCharactersBetweenTwoStrings {

	public static void main(String[] args) {
		try (var sc = new Scanner(System.in)) {
	        System.out.println("Enter the first string:");
	        var s1 = sc.nextLine().replaceAll("\\s+", "");
	        
	        System.out.println("Enter the second string:");
	        var s2 = sc.nextLine().replaceAll("\\s+", "");

	        // 1. Convert first string to a Set of unique characters
	        Set<Character> firstSet = s1.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.toSet());

	        // 2. Stream the second string and filter characters that exist in the first set
	        var commonChars = s2.chars()
	                .mapToObj(c -> (char) c)
	                .filter(firstSet::contains) // Keep only if present in the first set
	                .collect(Collectors.toSet());

	        System.out.println("Common Characters: " + commonChars);
	        System.out.println("Count: " + commonChars.size());
	    }
	}

}
