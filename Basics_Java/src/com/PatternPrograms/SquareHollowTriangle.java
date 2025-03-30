package com.PatternPrograms;

import java.util.Scanner;

public class SquareHollowTriangle {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
 			System.out.println("Enter a number: ");
 			int n = sc.nextInt();
 			
 			int spaces = -1;
 			int star1 = n-1, star2 = n-2;
 			
 			for(int i=1; i<=n; i++) {
 				//for printing stars on first
 				for(int j=1; j<=star1; j++) {
 					System.out.print("*");
 				}
 				//for spaces
 				for(int j=1; j<=spaces; j++) {
 					System.out.print(" ");
 				}
 				//for printing stars on last
 				for(int j=1; j<=star2; j++) {
 					System.out.print("*");
 				}
 				System.out.println();
 				if(i==n-1) {
 					star1 = n-1;
 					spaces = -1;
 					star2 = n-2;
 				}
 				else {
 					star1--;
 					spaces+=2;
 					if(i>1) star2--;
 				}
 			}
 		}
	}
}
