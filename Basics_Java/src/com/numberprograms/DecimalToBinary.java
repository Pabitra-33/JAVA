package com.numberprograms;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a decimal number: ");
 		int n = sc.nextInt();
 		
 		String bin = "";
 		int temp = n;
 		while(temp > 0) {
 			int rem = temp%2;
 			temp /= 2;
 			bin += rem;
 		}
 		System.out.println("Binary representation of the given number, "+n+" is: "+bin);
 		sc.close();
	}
}