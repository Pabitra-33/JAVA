package com.recursion;

import java.util.Scanner;

public class HighestThreePrimeInRange {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter starting range: ");
 		int st = sc.nextInt();
 		System.out.println("Enter ending range: ");
 		int end = sc.nextInt();
 		System.out.println("Highest Three Prime Numbers between "+st+" to "+end+" are: ");
 		int count = 0;
 		for(int i=end; i>=st; i--) {
 			if(isPrime(i, i/2)) {
 	 			count++;
 	 			System.out.println(i+" ");
 	 			if(count >= 3)
 	 				break;
 	 		}
 		}
 		sc.close();
 	}
 	
 	//prime check method
 	public static boolean isPrime(int n, int i) {
 		if(i == 1) return true;
 		if(n<=1 || n%i==0) return false;
 		return isPrime(n, i-1);
 	}
}
