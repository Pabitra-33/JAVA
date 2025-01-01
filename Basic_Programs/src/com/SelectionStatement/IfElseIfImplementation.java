package com.SelectionStatement;

import java.util.Scanner;

//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.
//to demonstrate the use of If else-if ladder.
public class IfElseIfImplementation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your marks between 1 to 100: ");
		int marks= scn.nextInt();  
	      
	    if(marks<50){  
	        System.out.println("Fail");  
	    }  
	    else if(marks>=50 && marks<60){  
	        System.out.println("D grade");  
	    }  
	    else if(marks>=60 && marks<70){  
	        System.out.println("C grade");  
	    }  
	    else if(marks>=70 && marks<80){  
	        System.out.println("B grade");  
	    }  
	    else if(marks>=80 && marks<90){  
	        System.out.println("A grade");  
	    }else if(marks>=90 && marks<100){  
	        System.out.println("A+ grade");  
	    }else{  
	        System.out.println("Invalid!");  
	    }  
	}  
}
