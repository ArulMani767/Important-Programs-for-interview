
public class ReverseStringUsingStringBuilder {
	

	public static void main(String[] args) {
		// by using for loop
		String s= "Muruga";
		char[] s1 = s.toCharArray();
		for(int i=s1.length-1;i>=0;i--) {
			System.out.print(s1[i]);
			
		}
		
		// by using string builder 
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		
       
		
		
			
		}
	}


