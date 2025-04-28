package com.PatternPrograms;

import java.util.Scanner;

public class LeftTrianglePattern {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a size: ");
 		int size = sc.nextInt();
 		int spaces = size-1;
 		
 		for(int i=1; i<=size; i++) {
 			//for printing spaces
 			for(int j=1; j<=spaces; j++) {
 				System.out.print(" ");
 			}
 			//for printing stars
 			for(int j=1; j<=i; j++) {
 				System.out.print("*");
 			}
 			System.out.println();//adds a new line
 			spaces--;
 		}
 		sc.close();
 	}
}
