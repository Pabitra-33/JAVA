package com.Loop_NumberPrograms;

import java.util.Scanner;

public class DigitsSumTillSingleDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int sum = 0;
		
		while(n > 0) {
			sum += n%10;
			n /= 10;
			
			if(n==0) System.out.println(sum);
			
			if(sum > 9) {
				n = sum;
				sum = 0;
			}
		}
	}

}
