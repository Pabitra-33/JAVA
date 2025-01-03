package com.Loops;

public class DoWhileLoop {
	
	public static void main(String[] args) 
	{
		int i = 1;
        int sum = 0;
        
        do {
            sum += i;
            i++;
        } while (i <= 5);
        
        System.out.println("Sum of numbers from 1 to 5 is: " + sum);
	}

}
