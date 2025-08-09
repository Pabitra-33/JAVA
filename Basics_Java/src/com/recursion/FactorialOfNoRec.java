package com.recursion;

import java.util.Scanner;

public class FactorialOfNoRec {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a number to calculate factorial:");
 		int n = sc.nextInt();
 		
 		System.out.print("Factorial of "+n+" is: ");
 		System.out.print(fact(n));
 		sc.close();
 	}
	
	public static int fact(int num) {
		if(num == 0) return 1;
		return num * fact(num - 1);
	}
}
