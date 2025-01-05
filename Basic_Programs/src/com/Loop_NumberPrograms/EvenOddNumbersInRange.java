package com.Loop_NumberPrograms;

import java.util.Scanner;

public class EvenOddNumbersInRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Get the range from the user
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("Even numbers in the range " + start + " to " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd numbers in the range " + start + " to " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
	}
}
