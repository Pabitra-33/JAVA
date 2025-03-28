package com.recursion;

import java.util.Scanner;

public class HighestThreeSpyRec {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter first range: ");
 		int first = sc.nextInt();
 		System.out.println("Enter last range: ");
 		int end = sc.nextInt();
 		
 		System.out.println("Highest three Spy number in between "+first+" and "+end+" are:");
 		for(int i=end; i>=first; i--) {
 			int count = 0;
 			if(isSpy(i,0,1)) {
 				count++;
 				System.out.println(i);
 				if(count >= 3) break;
 			}
 		}
 		sc.close();
 	}
 	
 	public static boolean isSpy(int n, int sum, int prod)
 	{
 		if(n==0) {
 			if(sum == prod) return true;
 			else return false;
 		}
 		int rem = n%10;
 		sum += rem;
 		prod *= rem;
 		return isSpy(n/10, sum, prod);
 	}
}
