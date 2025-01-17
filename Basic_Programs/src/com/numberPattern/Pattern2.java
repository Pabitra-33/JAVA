package com.numberPattern;

import java.util.Scanner;

public class Pattern2 {
	public static void printPattern(int n)
    {
        // outer loop to handle number of rows
        for (int i = 1; i <= n; i++) {
            // inner loop to print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print star
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // print new line for each row
            System.out.println();
        }
    }
	
	//main method
	public static void main(String args[])
    {
		System.out.println("Enter a number: ");
        int n = new Scanner(System.in).nextInt();
        //calling the printPattern function to print the pattern.
        printPattern(n);
    }
}
