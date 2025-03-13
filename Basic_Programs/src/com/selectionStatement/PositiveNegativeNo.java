package com.selectionStatement;

import java.util.Scanner;

public class PositiveNegativeNo {
	public static void main(String[] args) {
		//try-with resources
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int number = sc.nextInt();
			//checking a number is even or odd or zero
			if(number>0){  
				System.out.println("POSITIVE");  
			}
			else if(number<0){  
				System.out.println("NEGATIVE");  
			}
			else{  
				System.out.println("ZERO");  
   }
		}  
	}
}
