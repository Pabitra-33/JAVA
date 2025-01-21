package com.alphabetPattern;

public class AlphabetL {
	public static void main(String[] args) {
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++)
			{
				if(i==6 || j==1 ) {
					System.out.print(" *");
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
