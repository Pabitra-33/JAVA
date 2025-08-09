package com.basicprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		//storing in a temporary variable, to perform some operation on number num
		int temp = num;
		int rev = 0;//to store the reverse of the number
		while(num > 0) {
			int rem = num % 10;//getting the last digit
			rev = rev * 10 + rem;
			num /= 10;//removing the last digit
		}
		System.out.println("Reverse of the given number "+temp+" is: "+rev);
		sc.close();
	}
}
