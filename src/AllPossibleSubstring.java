import java.util.Scanner;

public class AllPossibleSubstring {
	
	private static void subString(String input) {
		System.out.println("All possible substring :"+ input + "are :");
		for(int i=0;i<input.length();i++) {
			for(int j=i+1;j<=input.length();j++) {
			System.out.println(input.substring(i, j));
				
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input string");
	String inputString = sc.next();
	subString(inputString);
	sc.close();
		

	}

}
