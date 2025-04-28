package com.recursion;

import java.util.Scanner;

public class SpyNumberCheckRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a number: ");
 		int n = sc.nextInt();
 		
 		if(isSpy(n,0,1)) {
 			System.out.println(n+" is a Spy Number");
 		}
 		else {
 			System.out.println(n+" is not a Spy Number");
 		}
 		sc.close();
 	}
	
	//isSpy check method
	public static boolean isSpy(int n, int sum, int mul) {
 		if(n==0) {
 			if(sum == mul) return true;
 			else return false;
 		}
 		int rem = n%10;
 		sum += rem;
 		mul *= rem;
 		return isSpy(n/10, sum, mul);
 	}
}
