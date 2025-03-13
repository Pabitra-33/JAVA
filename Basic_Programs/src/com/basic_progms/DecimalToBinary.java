package com.basic_progms;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n = sc.nextInt();
//		System.out.println("The Decimal number is: "+n);
//		int i =1;
//		int bin = 0;//to store the binary value
//		
//		while(n > 0) {
//			int bit = n%2;
//			bin = (bin*i)+bin;
//			i *= 10;
//			n /= 2;
//		}
//		System.out.print("The Binary number is: "+bin);
		
		String bin = "";
		int temp = n;
		while(temp > 0) {
			int rem = temp%2;
			temp /= 2;
			bin += rem;
		}
		System.out.println("Binary representation of "+n+" is: "+bin);
		sc.close();
	}
}
