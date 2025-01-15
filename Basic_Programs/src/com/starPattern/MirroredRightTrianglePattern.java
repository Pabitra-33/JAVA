package com.starPattern;

import java.util.Scanner;

public class MirroredRightTrianglePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
			System.out.println(); 
		}	
	}
}
