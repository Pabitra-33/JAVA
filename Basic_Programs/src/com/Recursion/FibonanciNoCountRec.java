package com.Recursion;

import java.util.Scanner;

public class FibonanciNoCountRec {

	public static void main(String[] args) {
		System.out.println("Enter number of count:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		fibonanciCountPrint(0,1,1,n);
		input.close();//closing the connection
	}
	static void fibonanciCountPrint(int a, int b, int count, int n) {
		if(count > n) return;
		System.out.print(a+" ");
		fibonanciCountPrint(b, a+b, ++count, n);
	}

}
