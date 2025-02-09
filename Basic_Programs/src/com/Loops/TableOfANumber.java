package com.Loops;

import java.util.Scanner;

//to print a table of any number given by the user.
public class TableOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println("Table of a given number "+n+" is: ");
		//using loop we iterate till a number's given range table
		for(int i=1; i<=10; i++)
		{ 
			System.out.println(n+" X "+i +" = "+(n*i));
		}
		sc.close();
	}

}
