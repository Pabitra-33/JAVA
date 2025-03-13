package com.basic_progms;

import java.util.Scanner;

public class MonthDaysCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month between 1 to 12: ");
		int monthNo = sc.nextInt();
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		
		switch (monthNo) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31days");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30days");
			break;
			
		case 2:
			if(year%400==0 || year%4==0 && year%100!=0)
			{
				System.out.println(year+" february has 28days");
				break;
			}
			else {
				System.out.println(year +" february has 29days");
				break;
			}
			
		default:
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
