package com.AlphabetPatterns;

public class AlphabetS {
	public static void main(String[] args) {
 		for(int i=1; i<=5; i++) {
 			for(int j=1; j<=5; j++) {
 				if(i==1 || i==5 ||(j==1&i<4) || i==3 || j==5&i==4) {
 					System.out.print(" *");
 				}
 				else {
 					System.out.print("  ");
 				}
 			}
 			//adds a new line
 			System.out.println();
 		}
 	}
}