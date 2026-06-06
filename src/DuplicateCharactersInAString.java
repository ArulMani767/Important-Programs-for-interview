import java.util.*;
import java.util.stream.*;

public class DuplicateCharactersInAString {
	
	public static void main(String[] args) {
		
		try (var sc = new Scanner(System.in)) {
	        System.out.println("Enter a string: ");
	        var inputString = sc.nextLine();

	        // count character occurrences in string
	        var charCounts = inputString.chars()
	            .mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(
	                c -> c,
	                Collectors.counting()));

	        System.out.println(
	            "Character counts: " + charCounts);

	        // filter duplicate characters count > 1 in string
	        var duplicateChars = charCounts
	            .entrySet()
	            .stream()
	            .filter(entry -> entry.getValue() > 1)
	            .collect(Collectors.toMap(
	                Map.Entry::getKey,
	                Map.Entry::getValue));

	        System.out.println(
	            "Duplicate characters: " + duplicateChars);
	    }
		

	}

}
