package com.basic_progms;

import java.util.Scanner;

public class AutomorphicNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		int sq = n*n;//square of the number
		boolean flag = true;
		
		while(n>0) {
			//if last digit of number & it's square last digit not matches then return false and break
			if(n%10 != sq%10)
			{
				flag = false;
				break;
			}
			n /= 10;//remove last digit from number
			sq /= 10;//remove last digit from square
		}
		if(flag) {
			System.out.println(temp+" is a Automorphic Number");
		}
		else {
			System.out.println(temp+" is not a Automorphic Number");
		}
		sc.close();	}
}
