package com.AlphabetPatterns;

public class AlphabetV {
	public static void main(String[] args) {
 		for(int i=1; i<=5; i++) {
 			for(int j=1; j<=9; j++) {
 				if(i==j || i+j==10) {
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