package com.Recursion;

import java.util.Scanner;

public class Printing1toARange {

	public static void main(String[] args) {
		//surrounding with try-with resource for implicit close of reference
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a range: ");
			int range = sc.nextInt();
			//calling display method
			display(1, range);
		}
	}
	
	static void display(int i, int range) {
		//base condition
		if(i > range) return;
		System.out.print(i+" ");
		display(i+1, range);//calling recursively
	}

}
