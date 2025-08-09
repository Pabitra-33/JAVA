package com.loops;

import java.util.Scanner;

public class PrintNameMultiple {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.nextLine();
		
		// for loop to print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(name+" ");
        }
        System.out.println("Loop has ended.");
        scn.close();	}
}