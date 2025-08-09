package read.arraysSorting;

import java.util.Arrays;

public class MergeSort {
	//merge sort follows divide and conquer
	public static void main(String[] args) {
		int[] arr = {9,2,7,5,8,1,6,4};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] a) {
		//base condition
		if(a.length == 1) return;
		
		//dividing
		int[] left = new int[a.length/2];
		int[] right = new int[a.length - left.length];
		
		for(int i=0; i<left.length; i++) {
			left[i] = a[i];//copying the elements
		}
		
		for(int j=0; j<right.length; j++) {
			right[j] = a[j+left.length];//copying the elements
		}
		
		//calling recursively
		sort(left);
		sort(right);
		merge(left, right, a);
	}

	private static void merge(int[] a, int[] b, int[] ele) {
		//take three pointer for three arrays
		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length) {
			if(a[i] < b[j])
				ele[k++] = a[i++];
			else
				ele[k++] = b[j++];
		}
		
		while(i<a.length) {
			ele[k++] = a[i++];
		}
		while(j<b.length) {
			ele[k++] = b[j++];
		}
	}
}