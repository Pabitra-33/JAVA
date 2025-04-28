package com.recursion;

import java.util.Scanner;

public class HighestSpyNoInRangeRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting range: ");
		int st = sc.nextInt();
		System.out.println("Enter the ending range: ");
		int end = sc.nextInt();
		
		System.out.println("Highest Spy number in between "+st+" and "+ end +" is: ");
		for(int i = end; i>=st; i--) {
			if(isSpy(i,0,1)) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
	
	//spy number check method
	public static boolean isSpy(int num, int sum, int mul) {
		if(num == 0) {
			if(sum == mul) return true;
			else return false;
		}
		int rem = num % 10;
		sum += rem;
		mul *= rem;
		return isSpy(num/10, sum, mul);
	}
}
