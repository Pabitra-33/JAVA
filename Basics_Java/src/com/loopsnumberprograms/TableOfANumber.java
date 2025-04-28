package com.loopsnumberprograms;

import java.util.Scanner;

public class TableOfANumber {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a number: ");
 		//input
 		int n = sc.nextInt();	
		System.out.println("Table of a given number "+n+" is: ");	
		
 		for(int i=1; i<=10; i++) {
 			System.out.println(n+ " X "+ i +" = "+(n*i));
 		}
 		sc.close();
 	}
}
