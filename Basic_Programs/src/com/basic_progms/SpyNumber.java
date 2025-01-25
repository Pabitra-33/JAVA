package com.basic_progms;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n = new Scanner(System.in).nextInt();
		
		if(isSpy(n)) {
			System.out.println(n+" is a Spy Number");
		}
		else {
			System.out.println(n+" is not a Spy Number");
		}
	}

	private static boolean isSpy(int n) {
		int sum = 0, product = 1;
		
		//executes until the condition becomes false  
		while(n>0)  
		{
			//finds the last digit of the number      
			int lastdigit=n%10;  
			//adds last digit to the variable sum  
			sum=sum+lastdigit;  
			
			//calculates the product  
			product=product*lastdigit;  
			
			//removes the last digit from the given number  
			n /= 10;
		}  

		if(sum == product) return true;
		else return false;
	}
}
