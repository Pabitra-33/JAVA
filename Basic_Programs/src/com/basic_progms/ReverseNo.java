package com.basic_progms;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number you want to reverse: ");
			int n = scn.nextInt();
			int temp = n;//storing in a temporary var, to perform some operation on number n.
			int rev = 0;
			while(n > 0) {
				int rem = n%10;
				rev = rev*10+rem;
				n /= 10;
			}
			System.out.println("Reverse of the given number "+temp+" is = "+rev);
		}
	}

}
