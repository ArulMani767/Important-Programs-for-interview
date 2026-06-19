public class AnaagramProgramWithIterativeLoops {
	
	static void  anagramprogram(String s1, String s2) {
		String whitespace = s1.replaceAll("\s", "").toLowerCase();
		String whitespace2 = s2.replaceAll("\s","").toLowerCase();
		boolean status=true;
		if(whitespace.length()== whitespace2.length()) {
			status=false;
		}
		else {
			char[] s3=whitespace.toCharArray();
		
			
			for(char c:s3) {
				int index = whitespace2.indexOf(c);
				if(index!=-1) {
					whitespace2=whitespace2.substring(0, index)+whitespace2.substring(index+1, whitespace2.length());
				}
				else {
					status=false;
					break;
				}
				
				if(status) {
					System.out.println(s1+" and "+s2+" are anagrams");
				}
				else {
					System.out.println(s1+" and "+s2+" not anagrams");
				}
			}
			
		}
	}

	public static void main(String[] args) {
		anagramprogram("keEp","Peek");

	}

}
