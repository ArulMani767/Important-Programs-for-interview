import java.util.*;
public class RemoveVowelsInString {

	public static void main(String[] args) {
		try (var sc = new Scanner(System.in)) {
	        System.out.println("Enter the string...");

	        // Using 'var' for local variable type inference 
	        var inputString = sc.nextLine();

	        // regex logic remains the same for replacing vowels
	        var newInputString = inputString.replaceAll("[AEIOUaeiou]", "");

	        System.out.println("The string without vowels...");
	        System.out.println(newInputString);
	    }
	}

}
