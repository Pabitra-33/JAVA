package com.basic_progms;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		int num = in.nextInt();
		
		int dec = 0;//to store decimal value
		int temp = num;
		int i=0;
		while(temp > 0) {
			int rem = temp%10;//getting last digit
			temp = temp/10;
			dec = dec+rem *(int) Math.pow(2, i++);
		}
		System.out.println("Decimal value of "+num+" is: "+dec);
		
		in.close();
	}
}
