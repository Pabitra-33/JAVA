package com.InterviewPrograms;

public class AddTwoNumbersWithoutArithmaticOP {
	public static void main(String[] args) {
		int a = 15, b = 27;
		
		while(b != 0) {
			int carry = a & b;
			a = a ^ b;//sum calculated
			b = carry << 1;
		}
		System.out.println("Sum is: "+a);
	}
}