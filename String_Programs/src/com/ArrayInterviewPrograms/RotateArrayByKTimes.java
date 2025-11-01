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

	//for rotation
	private static void rotate(int[] arr, int k) {
		//if we give 'k' greater than the array length it will not work
		k = k % arr.length;
		reverse(arr, 0, arr.length-1);//reverse full array
		reverse(arr, 0, k-1);//reverse till k-1 times
		reverse(arr, k, arr.length-1);//then reverse from k to last element in array
	}
	
	//for reversing
	public static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			//just simple swapping method
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}