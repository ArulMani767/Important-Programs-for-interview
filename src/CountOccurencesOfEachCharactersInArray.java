import java.util.*;
import java.util.stream.*;
public class CountOccurencesOfEachCharactersInArray {

	public static void main(String[] args) {
		try (var sc = new Scanner(System.in)) {
	        System.out.println("Enter the array elements to count each occurences");
	        var input = sc.nextLine();
	        
	        // 1. Create the array by splitting the input
	        var array = input.split("\\s+");

	        // 2. Count occurrences using the same logic as your string program
	        var occurrences = Arrays.stream(array)
	            .collect(Collectors.groupingBy(
	                e -> e, 
	                Collectors.counting()
	            ));

	        System.out.println("Element counts: " + occurrences);
	    }

	}

}
