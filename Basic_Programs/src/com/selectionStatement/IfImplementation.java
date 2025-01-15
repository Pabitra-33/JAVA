package com.selectionStatement;

import java.util.Scanner;

//Java Program to demonstrate the use of if statement.
public class IfImplementation {
	public static void main(String[] args) {  
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		//defining an 'age' variable
		int age=scn.nextInt();
		//checking the age is greater than equals to 18 or not.
		if(age>=18)
		{  
		   System.out.print("You are eligible to vote");  
		}  
	}
}
