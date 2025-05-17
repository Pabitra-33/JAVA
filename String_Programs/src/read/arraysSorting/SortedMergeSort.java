package read.arraysSorting;

import java.util.Arrays;

public class SortedMergeSort {
	public static void main(String[] args) {
		int[] arr1 = {3,4,6,8,9};//array one
		int[] arr2 = {1,2,4,6,8};//array two
		
		//creating a new array, of sum of the two array length
		int[] temp = new int[arr1.length + arr2.length];
		
		//take three pointers
		int i = 0, j = 0, k = 0;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				temp[k++] = arr1[i++];
			}
			else {
				temp[k++] = arr2[j++];
			}
		}
		
		//to pick un-picked elements from array1
		while(i < arr1.length) {
			temp[k++] = arr1[i++];
		}
		
		//to pick un-picked elements from array2
		while(j < arr2.length) {
			temp[k++] = arr2[j++];
		}
		System.out.println(Arrays.toString(temp));//[1, 2, 3, 4, 4, 6, 6, 8, 8, 9]
	}
}