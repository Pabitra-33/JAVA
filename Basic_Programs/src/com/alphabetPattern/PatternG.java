package com.alphabetPattern;

public class PatternG {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++)
			{
				if(j==1 || i==1 || i==5 || (i==3 & j>2) || (i>2 & j==5)) {
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
