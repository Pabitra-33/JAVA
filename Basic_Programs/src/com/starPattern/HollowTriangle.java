package com.starPattern;

import java.util.Scanner;

public class HollowTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int spaces = n-1;
		int stars = 1;
				
		for(int i=1; i<=n; i++) //for number of lines
		{
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=stars; j++) {
				if(i==n || j==1 || j==stars) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			spaces--;
			stars +=2;
		}
	}

}
