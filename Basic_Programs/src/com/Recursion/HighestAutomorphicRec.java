package com.Recursion;

import java.util.Scanner;

public class HighestAutomorphicRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int start = sc.nextInt();
		System.out.println("Enter last number: ");
		int end = sc.nextInt();
		
		System.out.print("Highest Automorphic Number between "+start+" and "+end+" is: ");
		for(int i=end; i>= start; i--) {
			if(isAutomorphic(i)) {
				System.out.println(i+" ");
				break;
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
