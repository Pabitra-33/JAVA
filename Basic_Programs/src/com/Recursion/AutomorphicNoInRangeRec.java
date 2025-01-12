package com.Recursion;

import java.util.Scanner;

public class AutomorphicNoInRangeRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int first = sc.nextInt();
		System.out.println("Enter last number: ");
		int last = sc.nextInt();
		
		System.out.print("Automorphic Numbers between "+first+" and "+last+" are: ");
		for(int i=first; i<= last; i++) {
			if(isAutomorphic(i)) {
				System.out.println(i+" ");
			}
		}
	}
	
	public static boolean isAutomorphic(int num)
	{
		int sqr = num*num;
		boolean flag = true;
		while(num > 0) {
			if(num%10 != sqr%10) 
			{
				return false;
			}
			sqr /= 10;
			return true;
		}
		return isAutomorphic(num/10);
	}
}
