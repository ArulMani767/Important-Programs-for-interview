import java.util.*;

public class ReverseanArray {
	
	public static void main(String[] args) {
		try (var sc = new Scanner(System.in)) {
	        System.out.println("Enter size of array:");
	        var input = sc.nextInt();
	        sc.nextLine(); // consume newline 

	        var arr = new String[input]; 
	        System.out.println("Enter elements of array:");
	        for (var i = 0; i < input; i++) {
	            arr[i] = sc.nextLine(); 
	        }

	        // Using StringBuilder because it is mutable, just like your ReverseString example
	        var result = new StringBuilder();

	        for (var element : arr) {
	            // Logic: Only append the element if it's not already in our result string
	            // This mirrors the 'if (result.indexOf(...) == -1)' logic 
	            if (result.indexOf(element) == -1) {
	                result.append(element).append(" ");
	            }
	        }

	        System.out.println("\nArray elements without duplicates:");
	        System.out.println(result.toString().trim());
	    }
	}

}
