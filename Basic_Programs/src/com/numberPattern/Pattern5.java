package com.numberPattern;
import java.util.*; 

public class Pattern5 {
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);    
		System.out.print("Enter the number of rows you want to print: ");      
		int rows = sc.nextInt();           
		for (int i = 1; i <= rows; i++)
		{  
			for (int j = 1; j <= i; j++){  
				System.out.print(i+" ");  
			}  
			System.out.println();  
		}  
		sc.close();//closing the scanner reference connection	
	}  
}
