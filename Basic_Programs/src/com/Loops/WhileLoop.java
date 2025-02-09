package com.Loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		//printing the numbers in a range given by user.
		//used the try-with resource to implicitly close the connection
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a range: ");
			int range = sc.nextInt();
			int i = 1;
			
			while(i <= range) {
				System.out.println(i+" ");
				i++;
			}
		}
	}

}
