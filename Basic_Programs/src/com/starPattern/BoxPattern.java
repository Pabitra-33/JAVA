package com.starPattern;

import java.util.Scanner;

public class BoxPattern {
	public static void main(String[] args) {
		//try-with resources
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size: ");
			int size = sc.nextInt();
			for(int i=1; i<=size; i++) {
				for(int j=1; j<=size; j++) {
					System.out.print(" * ");//prints star
				}
				System.out.println();
			}
		}
	}
}
