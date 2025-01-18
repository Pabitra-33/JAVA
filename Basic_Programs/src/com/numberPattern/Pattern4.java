package com.numberPattern;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		int x=1, y=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			//for odd lines
			if(i%2==0) {
				for(int j=1; j<=i; j++) {
					System.out.print(x+" ");
					x++;
				}
			}
			//for even lines
			else {
				y = x+(i-1);
				x = y+1;
				for(int j=1; j<=i; j++) {
					System.out.print(y+" ");
					y--;
				}
			}
			System.out.println();
		}
	}
}
