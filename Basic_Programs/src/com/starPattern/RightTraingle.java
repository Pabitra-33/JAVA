package com.starPattern;

import java.util.Scanner;

public class RightTraingle {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a size: ");
			int size = sc.nextInt();//user input
			
			//outer loop to print the no of row data
			for(int i=1; i<=size; i++)
			{
				//inner loop to print the no of column data
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				//adds a new line
				System.out.println();
			}
		}
	}
}
