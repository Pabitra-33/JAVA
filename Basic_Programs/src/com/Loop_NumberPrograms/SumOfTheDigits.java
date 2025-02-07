package com.Loop_NumberPrograms;

import java.util.Scanner;

public class SumOfTheDigits {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number:");
			int no = sc.nextInt();
			int sum = 0;
			
			System.out.print("Sum of the digits of a number "+no+" is: ");
			while(no > 0) {
				sum += no%10;
				no /= 10;
			}
			System.out.println(sum);
		}
	}
}
