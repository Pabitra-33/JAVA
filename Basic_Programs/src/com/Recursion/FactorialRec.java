package com.Recursion;

import java.util.Scanner;

public class FactorialRec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial:");
		int n = sc.nextInt();
		
		System.out.println(fact(n));
		sc.close();//closed
	}
	public static int fact(int num)
	{
		if(num == 0) return 1;//base condition
		return num * fact(num - 1);
	}

}
