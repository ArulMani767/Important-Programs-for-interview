
import java.util.*;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		try(var sc = new Scanner(System.in)){
		    System.out.println("Enter the size of array elements");
		    var size = sc.nextInt();
		    
		    var arrayone = new int[size];
		    var arraytwo = new int[size];
		    
		    System.out.println("Enter the size of first array");
		    for(var i=0;i<size;i++){
		        arrayone[i]=sc.nextInt();
		    }
		    
		    System.out.println("Enter the size of second array");
		    
		    for(var i=0;i<size;i++){
		        arraytwo[i]=sc.nextInt();
		    }
		    
		    var equal =true;
		    
		    if(arrayone==arraytwo){
		        for(var i=0;i<arrayone.length;i++){
		            if(arrayone.length!=arraytwo.length){
		                equal=false;
		                break;
		            }
		        }
		    }
		    
		    else{
		        equal=false;
		    }
		    if(equal){
		        System.out.println("two arrays are equal");
		    }
		    else{
		        System.out.println("two arrays are not equal");
		    }
		}
	}
}
