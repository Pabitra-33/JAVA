package com.fiftyArrayPrograms;

public class OddElementsSum9 {
	public static void main(String[] args) {
		// Declaring and initializing an array
		int[] arr = {1,2,3,4,6,8,9};
		
		// to store the even elements sum
		int odd_sum = 0;
		
		//traversing the array to visit each element in the array
		for(int i = 0; i<arr.length; i++) {
			//putting the odd check condition
			if(arr[i] % 2 != 0) {
				odd_sum += arr[i];
			}
		}
		System.out.println("Sum of odd elements in the array is: "+odd_sum);
	}
}