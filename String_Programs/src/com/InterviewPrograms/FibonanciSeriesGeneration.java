package com.InterviewPrograms;

import java.util.Scanner;

public class FibonanciSeriesGeneration {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of term: ");
		int num = scn.nextInt();
		
		int a = 0, b = 1;
		System.out.println("Fibonanci Series: ");
		for(int i = 1; i<=num; i++) {
			System.out.print(a+" ");
			int c = a+b;
			a = b;
			b = c;
		}
		scn.close();
	}
}