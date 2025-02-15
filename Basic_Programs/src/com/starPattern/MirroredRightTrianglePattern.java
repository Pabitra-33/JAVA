package com.starPattern;

import java.util.Scanner;

public class MirroredRightTrianglePattern {
	//main method to start the execution
	public static void main(String[] args) {
		//added try-with resources
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size: ");
			int n = sc.nextInt();
			
			//i is for rows & j is for columns
			for(int i=0; i<=n; i++) {
				
				//inner loop for printing space
				for(int j=1; j<=n-i; j++) {
					System.out.print(" ");
				}
				//printing the stars
				for (int j=0;j<=i;j++)  {  
					System.out.print("*");  
				}
				System.out.println(); //adds a new line after printing
			}
		}	
	}
}
