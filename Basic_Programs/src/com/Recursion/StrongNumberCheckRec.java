package com.Recursion;

import java.util.Scanner;

public class StrongNumberCheckRec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int sum = strong(num);
		if(sum == num) {
			System.out.println(num+" is a Strong Number");
		}
		else {
			System.out.println(num+" is not a Strong Number");
		}
	}

	public static int strong(int num) {
		if(num == 0) return 0;
		return fact(num%10) + strong(num/10);
	}

	public static int fact(int n) {
		if(n == 0) return 1;
		return n*fact(n-1);
	}

}
