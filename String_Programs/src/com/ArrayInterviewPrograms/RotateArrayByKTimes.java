package com.ArrayInterviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByKTimes {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = {1,3,5,7,4,9};
		System.out.println("Enter how many times you want to rotate: ");
		int k = scanner.nextInt();
		
		System.out.println("Before Roatating the array: "+ Arrays.toString(arr));
		rotate(arr,k);
		System.out.println("After Rotating the array: "+ Arrays.toString(arr));
		scanner.close();//closing the scanner object
	}

	private static void rotate(int[] arr, int k) {
		
	}
}