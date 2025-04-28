package com.numberprograms;

import java.util.Scanner;

public class SumOfTheDigits {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a number:");
 		int num = sc.nextInt();
 		int sum = 0;
 		
 		System.out.print("Sum of the digits of a number "+num+" is: ");
 		while(num > 0) {
 			sum += num % 10;
 			num /= 10;
 		}
 		System.out.println(sum);
 		sc.close();
 	}
}
