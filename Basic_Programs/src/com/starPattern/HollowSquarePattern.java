package com.starPattern;

import java.util.Scanner;

public class HollowSquarePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of lines: ");
		int lines = sc.nextInt();
		
		//for no of lines/rows
		for(int i=1; i<=lines; i++) {
			//for the columns
			for(int j=1; j<=lines; j++) {
				//conditions for where to print * and where to print ""
				if(i==1 || j==1 || i==lines || j==lines) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//adds a nextLine
			System.out.println();
		}
	}

}
