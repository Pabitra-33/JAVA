package com.numberPattern;
import java.util.Scanner; 

public class NumberRepeatationFromRange {
	public static void main(String[] args)   
	{    
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number of rows you want to print: ");  
		int n = sc.nextInt();  
		for (int i = 1; i <= n; i++)   
		{   
			for (int j = i; j >= 1; j--)  {  
				System.out.print(j+" ");  
			}  
			System.out.println();  
		}
		sc.close();
	}
}
/*output: 1 
          2 1 
          3 2 1 */