package com.AlphabetPatterns;

public class AlphabetP {
	public static void main(String[] args) {
 		for(int i=1; i<=5; i++) {
 			for(int j=1; j<=4; j++)
 			{
 				if(j==1 || i==1 || i==3 ||(j==4 & i==2)) {
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