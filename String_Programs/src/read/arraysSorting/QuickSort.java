package read.arraysSorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {6,5,7,9,2,3,1,10,5};
		System.out.println(Arrays.toString(arr));//before sort: [6, 5, 7, 9, 2, 3, 1, 10, 5]
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));//after sort: [1, 2, 3, 5, 5, 6, 7, 9, 10]
	}

	private static void sort(int[] a, int start, int end) {
		//base condition
		if(start >= end) return;
		
		//find the pivot element
		int pivot = a[(start + end)/2];
		int i = start, j = end;
		
		while(i <= j) {
			while(a[i] < pivot) i++;//keep smaller elements than in pivots left side
			while(a[j] > pivot) j--;//keep bigger elements than in pivots right side
			
			if(i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		sort(a, start, j);//calling recursively
		sort(a, i, end);
	}
}