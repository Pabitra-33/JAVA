package com.selectionstatements;

import java.util.Scanner;

public class SwitchImplementation {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a number 10,20 or 30: ");
 		int num = sc.nextInt();
 		
 		switch (num) {
 		case 10: 
 			System.out.println("Number is 10");
 			break;
 			
 		case 20:
 			System.out.println("Number is 20");
 			break;
 			
 		case 30:
 			System.out.println("Number is 30");
 			break;
 			
 		//when no case executed then the default one will execute.
 		default:
 			System.out.println("Not in 10,20 or 30");
 		}
 		sc.close();
 	}
}
