package com.recursion;

import java.util.Scanner;

public class SpyNumberInRangeRec {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter first range: ");
 		int first = sc.nextInt();
 		System.out.println("Enter last range: ");
 		int end = sc.nextInt();
 		
 		System.out.println("Spy numbers in between "+first+" and "+end+" are:");
 		for(int i=first; i<= end; i++) {
 			if(isSpy(i,0,1)) {
 				System.out.println(i+" ");
 			}
 		}
 		sc.close();//close the connection
 	}
 	
	//check spy number or not
 	public static boolean isSpy(int n, int sum, int prod) {
 		if(n==0) {
 			if(sum == prod) return true;
 			else return false;
 		}
 		int rem = n%10;
 		sum += rem;
 		prod *= rem;
 		return isSpy(n/10, sum, prod);
 	}
}
