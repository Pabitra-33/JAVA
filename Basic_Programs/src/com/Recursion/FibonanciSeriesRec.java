package com.Recursion;

import java.util.Scanner;

public class FibonanciSeriesRec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number till you want to print fibonanci series: ");
		int n = sc.nextInt();
		displayFibonanci(0,1,n);
	}
	
	public static void displayFibonanci(int a, int b, int n) {
		if(a > n) return;
		System.out.print(a+" ");
		displayFibonanci(b, a+b, n);
	}

}
