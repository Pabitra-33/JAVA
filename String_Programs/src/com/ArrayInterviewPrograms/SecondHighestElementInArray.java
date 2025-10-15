package com.ArrayInterviewPrograms;

public class SecondHighestElementInArray {
	public static void main(String[] args) {
		// Given array
		int[] arr = { 1, 3, 4, 5, 6 };
		
		int maximum_element = Integer.MIN_VALUE;
		int second_maximum = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num > maximum_element) {
				second_maximum = maximum_element;
				maximum_element = num;
			}
			else if(num > second_maximum && num != maximum_element) {
				second_maximum = num;
			}
		}
		
		if(second_maximum == Integer.MIN_VALUE) {
			System.out.println("There is no second highest element in the array.");
		}
		else {
			System.out.println("The Second Highest Element is: "+second_maximum);
		}
	}
}