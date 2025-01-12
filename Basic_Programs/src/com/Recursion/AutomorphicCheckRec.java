package com.Recursion;

import java.util.Scanner;

public class AutomorphicCheckRec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sq = n*n;//square of the number
		
		if(isAutomorphic(n,sq)) {
			System.out.println(n+" is an Automorphic Number");
		}
		else {
			System.out.println(n+" is not an Automorphic Number");
		}
	}
	
	public static boolean isAutomorphic(int num,int sqr)
	{
		boolean flag = true;
		while(num > 0) {
			if(num%10 != sqr%10) 
			{
				return false;
			}
			return true;
		}
		return isAutomorphic(num/10, sqr/10);
	}

}
