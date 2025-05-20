package read.arrayprograms;

import java.util.Arrays;

public class ArrayCopyMethod {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		//creating a new array to copy the elements
		int[] temp = new int[7];
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
		//copying the elements from one array to another.
		//System.arraycopy(SourceArr, StartIndex, DestinationArr, StartIndex, NoOfElements).
		System.arraycopy(arr, 0, temp, 0, 7);
		
		System.out.println(Arrays.toString(temp));
	}
}