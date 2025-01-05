package com.Loop_NumberPrograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number you want to calculate factorial: ");
		int number = scn.nextInt();
		int fact = 1;//to calculate and store factorial
		
		if(number == 1) {
			System.out.println("Factorial of "+number+" is: "+fact);
		}
		else
		{
			for(int i= 1; i<=number; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of "+number+" is: "+fact);
		}
		scn.close();
	}

}
