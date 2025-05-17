package read.arraysSorting;

import java.util.Arrays;

public class UnsortedMergeSort {
	public static void main(String[] args) {
		int[] a = {4,7,1,3};//array 1
		int[] b = {8,9,3,6};//array 2
		
		//creating a new array having equal length of the sum of the two array 
		int[] c = new int[a.length + b.length];
		
		int i = 0;
		while(i < a.length) {
			int j = i-1;
			while(j >= 0 && c[j] > a[i]) {
				c[j+1] = c[j];
				j--;
			}
			c[j+1] = a[i];
			i++;
		}
		System.out.println(Arrays.toString(c));//[1, 3, 7, 4, 0, 0, 0, 0]
		
		int k = 0;
		while(k < b.length) {
			int j = i-1;
			while(j >= 0 && c[j] > b[k]) {
				c[j+1] = c[j];
				j--;
			}
			c[j+1] = b[k];
			k++;
			i++;
		}
		System.out.println(Arrays.toString(c));//[1, 3, 3, 4, 6, 7, 8, 9] Sorted
	}
}