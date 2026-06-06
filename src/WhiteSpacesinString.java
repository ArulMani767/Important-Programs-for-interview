import java.util.*;
public class WhiteSpacesinString {
	
	// if we use inbuilt method with input string .replaceAll like below it will remove whitespaces 
	//inputString.replaceAll("\\s+", "");

	public static void main(String[] args) {
		try(var sc = new Scanner(System.in)) {
			System.out.println("Enter the string to remove whitespaces");
			var input = sc.nextLine();
			var output ="";
			for(var i=0; i<input.length(); i++) {
				var ch = input.charAt(i);
				if(ch!=' '&& ch!='\t') {
					output+=ch;
				}
			}
			System.out.println(input);
			System.out.println(output);
		}

	}

}
