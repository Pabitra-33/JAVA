package com.basicprograms;

import java.util.Scanner;

//A program to check weather a number is even or odd, without modulus operator.
public class EvenAndOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		// by using bitwise AND operator with value 1, we can achieve this.
		if((number & 1) == 0){
			System.out.println(number+" is a Even Number.");
		}
		else {
			System.out.println(number+" is a Odd Number");
		}
		
		sc.close();
	}
}