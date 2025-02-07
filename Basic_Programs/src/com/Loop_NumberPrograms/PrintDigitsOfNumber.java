package com.Loop_NumberPrograms;

import java.util.Scanner;

public class PrintDigitsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		System.out.println("Digits of the given number"+num+" are: ");
		while(num > 0) {
			System.out.println(num%10+" ");
			num /= 10;
		}
		sc.close();
	}
}
