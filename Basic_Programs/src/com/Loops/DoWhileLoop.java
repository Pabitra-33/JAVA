package com.Loops;

import java.util.Scanner;

public class DoWhileLoop {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range: ");
		int range = sc.nextInt();
		
		int i = 1;
        int sum = 0;
        
        do {
            sum += i;
            i++;
        } while (i <= range);
        
        System.out.println("Sum of numbers from 1 to "+range+" is: " + sum);
	}

}
