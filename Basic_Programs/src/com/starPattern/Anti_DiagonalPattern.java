package com.starPattern;

import java.util.Scanner;

public class Anti_DiagonalPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of lines: ");
		int lines = s.nextInt();
		
		//for no of rows/lines
		for(int i=1; i<=lines; i++) {
			//for no of columns
			for(int j=1; j<=lines; j++) {
				//condition to print the anti-diagonal
				if(i==j || i+j==lines+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
