package com.alphabetPattern;

public class AlphabetB {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++)
			{
				if(i==1 || i==3 || i==5 || j==1 || j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//adds a new line
			System.out.println();
		}
	}
}
