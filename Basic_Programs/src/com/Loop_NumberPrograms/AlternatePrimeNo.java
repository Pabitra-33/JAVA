package com.Loop_NumberPrograms;

import java.util.Scanner;

public class AlternatePrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first range: ");
		int start = sc.nextInt();
		System.out.println("Enter end range: ");
		int end = sc.nextInt();
		int count = 0;
		
		System.out.println("Alternative Prime Numbers between "+start+" and "+end+" are: ");
		for(int i=start; i<=end; i++) {
			if(isPrime(i)) {
				count++;
				
				if(count %2 !=0) 
					System.out.println(i+" ");
			}
		}
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
