package com.loopsnumberprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime: ");
		int num = sc.nextInt();
		
		//checking if the number is 1 or less than 1, then return "not prime"
		if(num <= 1) {
			System.out.println(num+" is not a Prime Number");
		}
		else {
			boolean flag = true;//reference variable to identify the prime no
			for(int i = 2; i<= num/2; i++) {
				if(num%i == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(num+" is a Prime Number");
			}
			else {
				System.out.println(num+" is not a Prime Number");
			}
		}
	}

}