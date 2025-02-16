package com.starPattern;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		//try-with resources
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the no of lines: ");
			int no = s.nextInt();
			
			int spaces = no-1;//no of spaces
			int stars = 1;//initially we want one star
			
			//iterating to no of lines
			for(int i=1; i<=no; i++) {
				//printing spaces
				for(int j=1; j<=spaces; j++) {
					System.out.print(" ");
				}
				//printing stars
				for(int j=1; j<=stars; j++) {
					System.out.print("*");
				}
				//adding a new line
				System.out.println();
				
				//updating spaces & stars value
				spaces--;
				stars += 2;//stars will increase each time by 2.
			}
		}
	}

}
