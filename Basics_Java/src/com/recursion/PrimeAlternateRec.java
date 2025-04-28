package com.recursion;

import java.util.Scanner;

public class PrimeAlternateRec {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter starting range: ");
 		int st = sc.nextInt();
 		System.out.println("Enter ending range: ");
 		int end = sc.nextInt();
 		
 		System.out.println("Alternate Prime Numbers are: ");
 		int count = 0;
 		for(int i=st; i<=end; i++) {
 			if(isPrime(i, i/2)) {
 				count++;
 				if(count % 2 == 0)
 					System.out.println(i+" ");
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
