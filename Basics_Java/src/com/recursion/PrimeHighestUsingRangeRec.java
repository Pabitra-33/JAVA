package com.recursion;

import java.util.Scanner;

public class PrimeHighestUsingRangeRec {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter starting range: ");
 		int st = sc.nextInt();
 		System.out.println("Enter ending range: ");
 		int end = sc.nextInt();
 		System.out.print("Highest Prime Number between "+st+" to "+end+" is: ");
 		range(st, end);
 		sc.close();
 	}
 	
	//range method
 	public static void range(int start, int end) {
 		if(start > end) return;
 		if(isPrime(end, end/2)) {
 			System.out.print(end);
 			return;
 		}
 		range(start, end-1);
 	}
 	
 	//prime check method
 	public static boolean isPrime(int n, int i) {
 		if(i == 1) return true;
 		if(n<=1 || n%i==0) return false;
 		return isPrime(n, i-1);
 	}
}
