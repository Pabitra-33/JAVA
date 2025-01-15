package com.starPattern;

import java.util.Scanner;

public class ReversePyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of lines: ");
		int lines = sc.nextInt();
		
		//for the no of lines/rows
		for(int i=0; i<=lines-1; i++) {
			//printing space
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			//printing stars
			for(int j=0; j<=lines-1-i; j++) {
				System.out.print("* ");
			}
			//add a new line
			System.out.println();
		}
	}

}
