import java.util.Arrays;

public class MergeTwoUnSortedArraysInSortedOrder {
	private static int[] mergeArray(int []a, int [] b) {
	int[] mergedarray = new int[a.length+b.length];
		int i=0, j=0,k=0;
		while(i<a.length) {
			mergedarray[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			mergedarray[k]=b[j];
			j++;
			k++;
		}
		Arrays.sort(mergedarray);
		return mergedarray;
		
		
		
	}

	public static void main(String[] args) {
	int[] first = new int[] {12, -7, 18, 9, 37, -1, 21};
	int[] second = new int[] {27, 8, 71, -9, 18};
	int[] merged = mergeArray(first,second);
	System.out.println("First:" +Arrays.toString(first));
	System.out.println("Second:"+Arrays.toString(second));
	System.out.println("Merged:"+Arrays.toString(merged));

	}

}
