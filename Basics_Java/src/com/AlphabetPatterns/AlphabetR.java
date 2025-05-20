package com.AlphabetPatterns;

public class AlphabetR {
	public static void main(String[] args) {
 		int k = 1;
 		for(int i=1; i<=6; i++) {
 			for(int j=1; j<=5; j++) {
 				if(j==1 || i==1 ||i==3|| (j==5&i<4) || i+j==k) {
 					System.out.print(" *");
 				}
 				else {
 					System.out.print("  ");
 				}
 			}
 			//adds a new line
 			System.out.println();
 			k +=2;
 		}
 	}
}