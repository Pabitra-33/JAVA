package com.fiftyArrayPrograms;

public class PrintEvenElementsArray4 {
	public static void main(String[] args) {
		//Declaring and initializing an integer array
		int[] array = {1,2,3,4,5,7,8,10};
		
		System.out.println("Even elements in the array: ");
		
		//traversing the array through the loop and finding the even elements
		for(int i = 0; i < array.length; i++) {
			//checking the element is even or odd
			if(array[i] % 2 == 0) {
				System.out.print(array[i]+" ");
			}
		}
	}
}