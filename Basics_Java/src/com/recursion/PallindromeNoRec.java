package com.recursion;

import java.util.Scanner;

public class PallindromeNoRec {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		int rev = isPallindrome(num, 0);//number=n and reverse=0
		
		if(num == rev)
			System.out.println(num+" is a Pallindrome Number.");
		else
			System.out.println(num+" is not a Pallindrome Number.");
		
		scanner.close();
	}
	
	public static int isPallindrome(int n, int rev) {
		if(n == 0) return rev;
		int rem = n % 10;//reminder
		rev = rev * 10 + rem;
		return isPallindrome(n/10, rev);
	}
}
