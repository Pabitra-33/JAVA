package com.numberPattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();   
		
		for(int i=0; i<n; i++)  
		{   
			int number=1;   
			//loop for columns  
			for(int j=0; j<=i; j++)  
		    {   
		       //prints number n  
		       System.out.print(number+ " ");  
			   //incrementing the value of number   
			   number++;
		    }
			System.out.println(); //throws the cursor at the next line after printing each row
		}
		in.close();
	}
}