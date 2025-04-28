package com.recursion;

import java.util.Scanner;

public class Printing1toGivenRange {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a range: ");
 		int range = sc.nextInt();
 		
 		display(1, range);
 		sc.close();
 	}
 	
 	static void display(int i, int range) {
 		if(i>range) 
 			return;
 		System.out.print(i+" ");
 		display(i+1, range);
 	}
}
