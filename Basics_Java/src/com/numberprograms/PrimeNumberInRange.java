package com.numberprograms;

import java.util.Scanner;

public class PrimeNumberInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first range: ");
		int start = sc.nextInt();
		System.out.println("Enter end range: ");
		int end = sc.nextInt();
		
		//putting a loop to iterate from start to end range
		for(int i=start; i<=end; i++) {
			//calling the prime method to check the numbers prime and printing them.
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		sc.close();
	}
	
	//prime check method
	public static boolean isPrime(int n) {
		if(n <= 1) return false;
		
		for(int i=2; i<=n/2; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}

}