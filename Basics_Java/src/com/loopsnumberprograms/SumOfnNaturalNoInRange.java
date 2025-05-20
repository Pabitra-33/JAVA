package com.loopsnumberprograms;

import java.util.Scanner;

public class SumOfnNaturalNoInRange {
	public static void main(String[] args) {
 		Scanner scn = new Scanner(System.in);
 		
 		System.out.println("Enter the start number: ");
 		int start = scn.nextInt();
 		System.out.println("Enter the end number: ");
 		int end = scn.nextInt();
 		
 		//to calculate & store sum, this variable taken
 		int sum = 0;
 		for(int i=start; i<= end; i++) {
 			sum += i;//adding each element to sum
 		}
 		System.out.println("Sum of numbers from "+start+" to "+end+" = "+sum);
 		scn.close();
 	}
}