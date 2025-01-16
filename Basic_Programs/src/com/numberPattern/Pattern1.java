package com.numberPattern;

public class Pattern1 {

	public static void main(String[] args) {
		int i, j,number, n;   
		
		for(i=0; i<7; i++)  
		{   
			number=1;   
			//loop for columns  
			for(j=0; j<=i; j++)  
		    {   
		       //prints num  
		       System.out.print(number+ " ");  
		    }
			//incrementing the value of number   
			number++;   
			}   
		//throws the cursor at the next line after printing each row  
		System.out.println();   
		}
	}
