package com.InterviewPrograms;

public class AddTwoNumbersWithoutArithmaticOP {
	public static void main(String[] args) {
		int a = 15, b = 27;
		
		while (b != 0) {
			//carry contains common set bits of a and b, shifted left by 1
			int carry = (a & b) << 1;
			// Update a to be the sum without carry
			a = a ^ b;
			// Update b to be the carry for the next iteration
			b = carry;
		}
		System.out.println("Sum is: "+a);
	}
}