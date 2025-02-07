package com.Loop_NumberPrograms;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first range: ");
		int start = sc.nextInt();
		System.out.println("Enter end range: ");
		int end = sc.nextInt();
		
		for(int i=start; i<=end; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		sc.close();
	}
	
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
