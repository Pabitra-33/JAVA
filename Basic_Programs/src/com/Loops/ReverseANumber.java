package com.Loops;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to reverse: ");
		int number = sc.nextInt();
		int reverse = 0;//to store the reversed number
		
		int temp = number;
		//we are performing operation on number so we are storing a copy of this original no in a temporary variable.
		
		while(number > 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number /= 10;
		}
		
		System.out.println("Reverse of "+temp+" is: "+reverse);
	}

}
