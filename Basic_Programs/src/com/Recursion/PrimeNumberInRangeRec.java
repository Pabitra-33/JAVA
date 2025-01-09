package com.Recursion;

import java.util.Scanner;

public class PrimeNumberInRangeRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting range: ");
		int st = sc.nextInt();
		System.out.println("Enter ending range: ");
		int end = sc.nextInt();
		System.out.print("Prime Numbers between "+st+" and "+end+" are: ");
		range(st, end);
	}
	public static void range(int start, int end) {
		if(start > end) return;
		if(isPrime(start, start/2))
			System.out.print(start+" ");
		range(start+1, end);
	}
	
	public static boolean isPrime(int n, int i) {
		if(i==1) return true;
		if(n<=1 || n%i == 0) return false;
		return isPrime(n, i-1);
	}
}
