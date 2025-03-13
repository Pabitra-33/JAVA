package com.numberPattern;
import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args)   
	{ 
		System.out.println("Enter the no of rows: ");
		Scanner scanner = new Scanner(System.in);
		int rows= scanner.nextInt();
		//iterate a loop
		for (int i = 1; i <= rows; i++)
		{  
			for (int j = 1; j <= i; j++){  
				if(j%2 == 0){  
					System.out.print(0);
				}else  {  
					System.out.print(1);
				}  
			}  
	        System.out.println();  
	    }
		scanner.close();//closing the scanner class reference connection
	}
}
