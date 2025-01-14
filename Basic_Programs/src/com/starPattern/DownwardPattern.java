package com.starPattern;

import java.util.Scanner;

public class DownwardPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no of lines: ");
		int line = scn.nextInt();//no of line input
		
		//for iterating till no of lines/rows
		for(int i=1; i<=line; i++) {
			//for iterating no of columns
			for(int j=i; j<=line; j++) {
				System.out.print("* ");
			}
			//adding new line
			System.out.println();
		}
	}
}
