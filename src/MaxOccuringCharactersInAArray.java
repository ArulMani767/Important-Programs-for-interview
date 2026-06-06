import java.util.*;
import java.util.stream.*;
public class MaxOccuringCharactersInAArray {

	public static void main(String[] args) {
		try (var sc = new Scanner(System.in)) {
	        System.out.println("Enter array elements separated by spaces:");
	        var input = sc.nextLine();

	        // 1. Convert input string into an array of words/elements
	        var array = input.split("\\s+");

	        // 2. Count occurrences of each element [cite: 595-596]
	        var charcount = Arrays.stream(array)
	            .collect(Collectors.groupingBy(
	                e -> e, 
	                Collectors.counting()
	            ));

	        // 3. Find the element with the maximum count [cite: 197]
	        var maxoccurence = charcount.entrySet() 
	            .stream()
	            .max(Map.Entry.comparingByValue())
	            .orElseThrow();

	        System.out.println(charcount);
	        System.out.println("max occurences:" + maxoccurence.getKey() +" "+ maxoccurence.getValue());
	    }

	}

}
