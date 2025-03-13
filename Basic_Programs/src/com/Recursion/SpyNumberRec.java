package com.Recursion;

import java.util.Scanner;

public class SpyNumberRec {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		try (Scanner df = new Scanner(System.in)) {
			int n = df.nextInt();
			
			if(isSpy(n,0,1)) {
				System.out.println(n+" is a Spy Number");
			}
			else {
				System.out.println(n+" is not a Spy Number");
			}
		}
	}
	
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
