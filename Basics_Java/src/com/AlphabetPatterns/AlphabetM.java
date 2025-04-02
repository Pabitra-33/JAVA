package com.AlphabetPatterns;

public class AlphabetM {
	public static void main(String[] args) {
 		for(int i=1; i<=5; i++) {
 			for(int j=1; j<=5; j++)
 			{
 				if(j==1 || j==5 ||(i==j && i<=3)||(i+j==6 && j>=3)) {
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