package com.Recursion;

import java.util.Scanner;

public class EvenAndOddUsingRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number : ");
		int st = sc.nextInt();
		System.out.println("Enter ending number : ");
		int end = sc.nextInt();
		
		System.out.println("Even numbers between "+st+" to "+end+" are: ");
		rangeEven(st, end);
		System.out.println();
		System.out.println("Odd numbers between "+st+" to "+end+" are: ");
		rangeOdd(st, end);
	}
	
	//to print even numbers
	public static void rangeEven(int start, int end)
	{
		if(start > end) return;
		if(start % 2 == 0)
			System.out.print(start+" ");
		rangeEven(start+1, end);
	}
	
	//to print odd numbers
	public static void rangeOdd(int start, int end)
	{
		if(start > end) return;
		if(start % 2 != 0)
			System.out.print(start+" ");
		rangeOdd(start+1, end);
	}
}
