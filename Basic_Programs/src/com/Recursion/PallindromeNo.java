package com.Recursion;

import java.util.Scanner;

public class PallindromeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int rev = isPallindrome(num, 0);
		if(num == rev){
			System.out.println(num+" is a Pallindrome Number.");
		}
		else {
			System.out.println(num+" is not a Pallindrome Number.");
		}
		sc.close();//closing the connection
	}
	
	public static int isPallindrome(int n, int rev) {
		if(n==0) return rev;
		rev = rev*10 +(n%10);
		return isPallindrome(n/10, rev);
	}
}
