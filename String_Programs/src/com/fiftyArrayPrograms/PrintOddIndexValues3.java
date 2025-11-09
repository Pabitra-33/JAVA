package com.fiftyArrayPrograms;

public class PrintOddIndexValues3 {
	public static void main(String[] args) {
		//Declaring and initializing the integer array
		int[] numbers = {1,2,3,4,5,6};
		
		System.out.println("Elements at the odd indexes: ");
		
		//Traversing the array to find the elements at odd index through loops
		for(int i = 0; i < numbers.length; i++) {
			//if it's not divisible by 2 then it's odd index position
			if(i % 2 != 0) {
				System.out.print(numbers[i]+" ");
			}
		}
	}
}