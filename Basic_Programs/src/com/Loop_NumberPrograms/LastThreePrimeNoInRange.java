package com.Loop_NumberPrograms;

import java.util.Scanner;

public class LastThreePrimeNoInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a start range: ");
		int st = sc.nextInt();
		System.out.println("Enter a end range: ");
		int end = sc.nextInt();
		int count = 0;
		
		for(int i=end; i>=st; i--) {
			if(isPrime(i)) {
				count++;
				System.out.println(i);
				if(count == 3) break;
			}
		}
		sc.close();
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
