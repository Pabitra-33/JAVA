package com.loopsnumberprograms;

import java.util.Scanner;

public class GreatestOfTwoNo {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter first number:");
 		int num1 = sc.nextInt();
 		System.out.println("Enter second number:");
 		int num2 = sc.nextInt();
 		
 		//put condition to calculate greater
 		if(num1 > num2) {
 			System.out.println(num1+" is greater than "+num2);
 		}
 		else if(num2 > num1) {
 			System.out.println(num2+" is greater than "+num1);
 		}
 		else {
 			System.out.println(num1+" and "+num2+" are equal");
 		}
 		sc.close();
 	}
}
