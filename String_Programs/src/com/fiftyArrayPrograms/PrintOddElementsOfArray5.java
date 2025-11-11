package com.fiftyArrayPrograms;

public class PrintOddElementsOfArray5 {
	public static void main(String[] args) {
		// Declaring and initializing the array
        int[] numbers = {1, 2, 3, 4, 5, 6};
        
        System.out.println("Odd elements in the array: ");
        
        //traversing the array and finding the odd elements present
        for(int i=0; i<numbers.length; i++) {
        	//odd check condition
        	if(numbers[i] % 2 != 0) {
        		System.out.print(numbers[i]+" ");
        	}
        }
	}
}