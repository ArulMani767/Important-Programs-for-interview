import java.util.stream.*;
import java.util.*;

public class CommonElementsBetweenTwoArrays {

	public static void main(String[] args) {
		/*
		 * String s1[]= {"one","Two","Three","Four","Five"}; String s2[]=
		 * {"Seven","Eight","Six","Five","Four"}; HashSet<String> set= new HashSet<>();
		 * for(int i=0;i<s1.length;i++) { for(int j=0;j<s2.length;j++) { if(s1[i]==
		 * s2[j]) { set.add(s1[i]); } } } System.out.println(set);
		 */
		
		
		var s1 = new String[]{"one", "Two", "Three", "Four", "Five"};
	    var s2 = new String[]{"Seven", "Eight", "Six", "Five", "Four"};

	    // 1. Create a Set from the second array for fast O(1) lookup
	    var set2 = Set.of(s2);

	    // 2. Stream the first array and filter by elements present in the second set
	    var commonElements = Arrays.stream(s1)
	            .filter(set2::contains)
	            .collect(Collectors.toSet());

	    System.out.println("Common Elements: " + commonElements);
	}
	
	// we can use retain all as method and create  two hashset and inside the hashset we can use arrays.aslist(string(s1))and s2 
	//and then retain s1.retainAll(s2) and then print s1

}
