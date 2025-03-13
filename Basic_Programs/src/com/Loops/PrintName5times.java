package com.Loops;

import java.util.Scanner;

public class PrintName5times {

	public static void main(String[] args) {
		//used try-with resource for implicit close of connection
		try (Scanner scn = new Scanner(System.in)) {
			String name = scn.nextLine();
			
			// for loop to print name 5 times
			for (int i = 1; i <= 5; i++) {
			    System.out.println(name+" ");
			}
		}
		System.out.println("Loop has ended.");
	}
}
