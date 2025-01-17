package com.numberPattern;

import java.util.Scanner;

public class SnakePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			//for odd lines
			if(i%2!=0) {
				int x = ((i-1)*n)+1;
				for(int j=1; j<=n; j++) {
					System.out.print(x+"\t");
					x++;
				}
			}
			else {
				//for even lines
				int y = i*n;
				for(int j=1; j<=n; j++) {
					System.out.print(y+"\t");
					y--;
				}
			}
			//adds a new line
			System.out.println();
		}
	}
}
