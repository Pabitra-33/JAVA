package com.recursion;

public class DisplayNoRecursion {
	public static void main(String[] args) {
 		display(1);
 	}
 	
 	static void display(int i){
 		if(i > 10) return;//base case
 		
 		System.out.println(i);
 		//call recursively
 		display(i+1);
 	}
}
