package read.arraysSorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] numbers = {3,5,2,6,9,8,10,4};
		System.out.println(Arrays.toString(numbers));//before sorting
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	private static void sort(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			int index = i; //taking the first position as index
			for(int j = i+1; j<arr.length; j++) {
				//check whether any other small element exist from the index
				if(arr[j] < arr[index]) {
					index = j;//then make that as index
				}
			}
			//check if i is not the index, then swap it with the index
			if(i != index) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
	}
}