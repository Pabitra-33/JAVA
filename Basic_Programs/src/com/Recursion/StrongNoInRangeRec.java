package com.Recursion;

import java.util.Scanner;

public class StrongNoInRangeRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int first = sc.nextInt();
		System.out.println("Enter last number: ");
		int last = sc.nextInt();
		
		System.out.println("Strong numbers between "+first+" and "+last+" are: ");
		for(int i= first; i<= last; i++)
		{
			int sum = isStrong(i);
			if(sum == i) {
				System.out.println(i+" ");
			}
		}
	}

	public static int isStrong(int num) {
		if(num == 0) return 0;
		return fact(num%10) + isStrong(num/10);
	}

	public static int fact(int n) {
		if(n == 0) return 1;
		return n*fact(n-1);
	}
}
