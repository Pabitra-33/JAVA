package com.Recursion;

import java.util.Scanner;

public class PerfectNoRec {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n = new Scanner(System.in).nextInt();
		int sum = isPerfect(n, n/2, 0);//no, division, sum
		if(n == sum) {
			System.out.println(n+" is a Perfect Number");
		}
		else {
			System.out.println(n+" is not a Perfect Number");
		}
	}
	
	public static int isPerfect(int num, int div, int sum) {
		if(div == 0) return sum;
		if(num%div == 0) sum+=div;
		return isPerfect(num, div-1, sum);
	}
}
