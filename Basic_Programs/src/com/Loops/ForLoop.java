package com.Loops;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1-15: ");
		int number = sc.nextInt();
		
		System.out.println("Printing numbers from 1 to 20 by skipping the user entered number:");
		for(int i=1; i<=20; i++) {
			if(i == number) continue;//used to skip the iteration for loop becomes true.
			
			System.out.println(i+" ");
		}
		sc.close();
	}
}
