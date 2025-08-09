package read.arraysSorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {4,9,6,5,2,8,1,7};
		System.out.println(Arrays.toString(arr));//before sort: 4, 9, 6, 5, 2, 8, 1, 7
		sort(arr);
		System.out.println(Arrays.toString(arr));//after sort: 1, 2, 4, 5, 6, 7, 8, 9
	}

	private static void sort(int[] arr) {
		//traverse the array
		for(int i= 0; i<arr.length; i++) {
			int key = arr[i];//taking a random element as key
			int j = i-1;
			
			while(j >= 0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
}