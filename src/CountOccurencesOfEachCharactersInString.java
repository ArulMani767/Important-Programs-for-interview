import java.util.*;
import java.util.stream.*;

public class CountOccurencesOfEachCharactersInString {
	public static void main(String[] args) {
		
	
	 try (var sc = new Scanner(System.in)) {
	        System.out.println("Enter a string: ");
	        var inputString = sc.nextLine();

	        // count character occurrences in a string 
	        var charCounts = inputString.chars()
	            .mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(
	                c -> c,
	                Collectors.counting()));

	        System.out.println(
	            "Character counts: " + charCounts);
	 }
}
}