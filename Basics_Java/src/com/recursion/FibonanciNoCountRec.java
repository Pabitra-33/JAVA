package com.recursion;

import java.util.Scanner;

public class FibonanciNoCountRec {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		
 		System.out.println("Enter number of count:");
 		int n = scanner.nextInt();
 		fibonanciCountPrint(0,1,1,n);
 		scanner.close();
 	}
 	static void fibonanciCountPrint(int a, int b, int count, int n) {
 		if(count > n) return;
 		System.out.print(a+" ");
 		fibonanciCountPrint(b, a+b, ++count, n);
 	}
}
