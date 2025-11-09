package com.fiftyArrayPrograms;

public class PrintEvenIndexValues2 {
	public static void main(String[] args) {
		// Declaring and initializing a integer variable
		int[] arr = {1,2,3,4,5,6};//Given array
		
		System.out.println("Elements at even indexes: ");
		
		//iterating through the array by loops and finding the element at even index
		for (int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}