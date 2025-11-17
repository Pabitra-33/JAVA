package com.fiftyArrayPrograms;

import java.util.Scanner;

public class InsertEvenValues14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Asking user how many numbers they want to enter
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		int index = 0; // To track inserted even numbers

		// Take user input and store ONLY even values
		System.out.println("Enter " + size + " numbers:");
		for (int i = 0; i < size; i++) {
			int num = sc.nextInt();

			if (num % 2 == 0) { // Check even
				arr[index] = num;
				index++;
			}
		}

		// Printing the even values inserted
		System.out.print("Even values inserted in the array: ");
		for (int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}