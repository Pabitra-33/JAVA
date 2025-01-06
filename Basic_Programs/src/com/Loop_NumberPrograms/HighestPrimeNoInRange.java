package com.Loop_NumberPrograms;

import java.util.Scanner;

public class HighestPrimeNoInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a start range: ");
		int st = sc.nextInt();
		System.out.println("Enter a end range: ");
		int end = sc.nextInt();
		
		for(int i=end; i>=st; i--) {
			if(isPrime(i)) {
				System.out.println(i);
				break;
			}
		}
	}
	
	//prime no check
	public static boolean isPrime(int n)
	{
		if(n <= 1) return false;
		
		for(int i=2; i<=n/2; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
}
