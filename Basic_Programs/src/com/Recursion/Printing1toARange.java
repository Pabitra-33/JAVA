package com.Recursion;

import java.util.Scanner;

public class Printing1toARange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range: ");
		int range = sc.nextInt();
		
		display(1, range);
	}
	
	static void display(int i, int range) {
		if(i>range) 
			return;
		System.out.print(i+" ");
		display(i+1, range);
	}

}
