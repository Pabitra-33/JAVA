package com.basicprograms;

import java.util.Scanner;

public class PositiveNegativeNumber {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a number: ");
 		int number = sc.nextInt();
 		
 	    if(number>0){  
 	    	System.out.println("POSITIVE");  
 	    }
 	    else if(number<0){  
 	    	System.out.println("NEGATIVE");  
 	    }
 	    else{  
 	    	System.out.println("ZERO");  
 	   }  
 	   sc.close();
 	}
}
