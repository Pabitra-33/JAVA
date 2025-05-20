package com.loopsnumberprograms;

import java.util.Scanner;

public class SumOfEvenNumbers {
	public static void main(String[] args) {
 		int sum = 0;
 
 	    // create an object of Scanner class
 	    Scanner scn = new Scanner(System.in);
 
 	    // take integer input from the user
 	    System.out.println("Enter a number: ");
 	    int number = scn.nextInt();
 		   
 	    // while loop continues 
 	    // until entered number is positive, when -ve no entered loop terminates.
 	    while (number >= 0) {
 	      // add only positive numbers
 	      sum += number;
 
 	      System.out.println("Enter a number: ");
 	      number = scn.nextInt();
 	    }
 		   
 	    System.out.println("Sum of positive numbers = " + sum);
 	    scn.close();
 	}
}
