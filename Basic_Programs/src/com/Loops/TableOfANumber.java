package com.Loops;

import java.util.Scanner;

//to print a table of any number given by the user.
public class TableOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt()
;		
		for(int i=1; i<=10; i++)
		{ 
			System.out.println(n+" X "+i +" = "+(n*i));
		}
	}

}
