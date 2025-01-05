package com.Loop_NumberPrograms;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scn.nextInt();
		
		//to calculate & store sum, this variable taken
		int sum = 0;
		for(int i=1; i<= num; i++) {
			sum += i;//adding each element to sum
		}
		System.out.println("Sum of N natural numbers from 1 to "+num+" is = "+sum);
	}

}
