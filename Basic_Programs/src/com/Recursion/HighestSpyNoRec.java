package com.Recursion;

import java.util.Scanner;

public class HighestSpyNoRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first range: ");
		int first = sc.nextInt();
		System.out.println("Enter last range: ");
		int end = sc.nextInt();
		
		System.out.println("Spy numbers in between "+first+" and "+end+" are:");
		for(int i=end; i>=first; i--) {
			if(isSpy(i,0,1)) {
				System.out.println(i);
				break;
			}
		}
	}
	
	public static boolean isSpy(int n, int sum, int prod)
	{
		if(n==0) {
			if(sum == prod) return true;
			else return false;
		}
		int rem = n%10;
		sum += rem;
		prod *= rem;
		return isSpy(n/10, sum, prod);
	}
}
