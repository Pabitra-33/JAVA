package read.arrayprograms;

import java.util.Arrays;

public class ReversingArray {
	public static void main(String[] args) {
		int[] arr = {1,7,2,5,5,6,8,7,7,9};//given array
		
		System.out.println("Original array: ");
		System.out.println(Arrays.toString(arr));//[1, 7, 2, 5, 5, 6, 8, 7, 7, 9]
		
		//taken two pointers and swapping the first with last,
		//till the start is less than the end
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println("Reversed array: ");
		System.out.println(Arrays.toString(arr));//[9, 7, 7, 8, 6, 5, 5, 2, 7, 1]
	}
}