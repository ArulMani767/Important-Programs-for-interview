import java.util.Arrays;

public class BubbleSortAlgorithm {
	static int[] bubblesort(int[] input) {
		int temp;
		for(int i=0;i<input.length-1;i++) {
			for(int j=0;j<input.length-i-1;j++) {
				if(input[j]>input[j+1]) {
					temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
					
				}
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = new int[] {7,9,4,3};
		System.out.println("input array :" +Arrays.toString(input));
		int[] sortedarray = bubblesort(input);
		System.out.println("sorted array :" +Arrays.toString(sortedarray));

	}

}
