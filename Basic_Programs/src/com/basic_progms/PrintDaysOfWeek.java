package com.basic_progms;

import java.util.Scanner;

//to print the days of week based on the user input.
public class PrintDaysOfWeek {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number between 1-7: ");
		int dayno = scn.nextInt();
		
		switch (dayno) {
		case 1:
			System.out.println("Sunday");
			break;
			
		case 2:
			System.out.println("Monday");
			break;

		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4:
			System.out.println("Wednesday");
			break;

		case 5:
			System.out.println("Thursday");
			break;

		case 6:
			System.out.println("Friday");
			break;

		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Invalid input");
		}
		scn.close();
	}

}
