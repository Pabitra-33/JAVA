package com.starPattern;

import java.util.Scanner;

public class AntiDiagonalStar {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int n = sc.nextInt();
			for(int i=0; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(i==j || i+j==n+1) {
						System.out.print("*");//prints star
					}
					else {
						System.out.print(" ");//prints space
					}
				}
				System.out.println();
			}
		}
	}
}
