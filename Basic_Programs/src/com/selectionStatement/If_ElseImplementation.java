package com.selectionStatement;

//Write a java program to implement if-else block in java.
//this is a program to check whether a number is even or odd.
import java.util.Scanner;

public class If_ElseImplementation {

	public static void main(String[] args) {
		//try-with resource
		try (Scanner scn = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int n = scn.nextInt();
			
			if(n % 2 == 0)
			{
				System.out.println(n+" is an Even Number");
			}
			else {
				System.out.println(n+" is an Odd Number");
			}
		}
	}
}
