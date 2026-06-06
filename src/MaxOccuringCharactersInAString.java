import java.util.*;
import java.util.stream.*;


public class MaxOccuringCharactersInAString {
	public static void main(String[] args) {
		try (var sc = new Scanner(System.in)) {
	        System.out.println("Enter a string: ");
	        var input = sc.nextLine();

	        // 1. Group characters and count occurrences [cite: 186-190]
	        var charCounts = input.chars()
	            .mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

	        // 2. Find the entry with the maximum value (count)
	        var maxocurences = charCounts.entrySet()
	            .stream()
	            .max(Map.Entry.comparingByValue())
	            .orElseThrow(); // Handles empty input

	        System.out.println("Character counts: " + charCounts);
	        System.out.println("maximum ocuureces:"   + maxocurences.getKey() +"  "+ maxocurences.getValue());
	    }

	}

}
