import java.util.*;
public class ReverseEachWordInString {
	public static void main(String[] args) {
		try(var sc = new Scanner(System.in)) {
			System.out.println("Enter the String to reverse each word");
			if(sc.hasNext()) {
				var input = sc.nextLine();
				var output = input.split(" ");
				var result = new StringBuilder();

				for (var words:output) {
					var reversedword = new StringBuilder(words).reverse().toString();
					result.append(reversedword).append(" ");
				}
				
				System.out.println(output);
				System.out.println(result.toString().trim());
			}
		}
	}

}
