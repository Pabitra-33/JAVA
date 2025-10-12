package com.InterviewPrograms;

public class MissingNumberInArray {
	public static void main(String[] args) {
		//Given array
		int[] arr = {1,3,4,5,6};
		
		//length of the array including the missing one
		int len = arr.length+1;
		
		int actual_sum = len*(len+1)/2;//sum of n natural numbers formula
		int array_sum = 0;
		
		for(int n: arr) {
			array_sum += n;
		}
		
		int missing_element = actual_sum - array_sum;
		
		System.out.println("The missing number is: "+missing_element);
	}
}