package com.selectionstatements;

import java.util.Scanner;

public class IfElseImplementation {
	public static void main(String[] args) {
 		Scanner scn = new Scanner(System.in);
 		System.out.print("Enter a number: ");
 		int n = scn.nextInt();
 		
 		if(n % 2 == 0){
 			System.out.println(n+" is an Even Number");
 		}
 		else {
 			System.out.println(n+" is an Odd Number");
 		}
 		scn.close();
 	}
}
