package com.starPattern;

import java.util.Scanner;

public class PyramidPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		
		//i is for rows & j is for columns
		for(int i=0; i<n; i++) {
			
			//inner loop for printing space
			for(int j=n-i; j>1; j--) {
				System.out.print(" ");
			}
			
			//inner loop for printing star
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			
			//throws the cursor in a new line after printing each line  
			System.out.println();
		}
	}
}
