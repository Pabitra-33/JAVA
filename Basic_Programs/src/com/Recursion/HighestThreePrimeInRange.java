package com.Recursion;

import java.util.Scanner;

public class HighestThreePrimeInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting range: ");
		int st = sc.nextInt();
		System.out.println("Enter ending range: ");
		int end = sc.nextInt();
		System.out.print("Highest Prime Number between "+st+" to "+end+" is: ");
		range(st, end, 0);
		sc.close();//closed the reference
	}
	
	public static void range(int start, int end, int count) {
		if(start > end) return;
		if(isPrime(end, end/2)) {
			count++;
			System.out.print(end+" ");
			if(count >= 3) return;
		}
		range(start, end-1, count);
	}
	
	public static boolean isPrime(int n, int i) {
		if(i == 1) return true;
		if(n<=1 || n%i==0) return false;
		return isPrime(n, i-1);
	}
}
