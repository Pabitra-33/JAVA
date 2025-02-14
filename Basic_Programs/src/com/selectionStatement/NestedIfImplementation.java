package com.selectionStatement;

import java.util.Scanner;

public class NestedIfImplementation {

	public static void main(String[] args) {
		//try-with resources
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your age: ");
			int age=sc.nextInt();
			System.out.println("Enter your age: ");
			int weight=sc.nextInt();
			
			//applying condition on age and weight by using nested-if 
			if(age>=18){    
				if(weight>50){  
					System.out.println("You are eligible to donate blood");  
				}
			}
		}  
	}

}
