package com.recursion;

import java.util.Scanner;

public class PerfectNumberRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int sum = isPerfect(num, num/2, 0);//number, divisor and sum=0
		
		if(num == sum) {
 			System.out.println(num+" is a Perfect Number");
 		}
 		else {
 			System.out.println(num+" is not a Perfect Number");
 		}
		sc.close();
	}
	
	//isPerfect check method
	public static int isPerfect(int n, int div, int sum) {
		if(div == 0) return sum;
		if(n % div == 0) sum += div;
		return isPerfect(n, div-1, sum);
	}
}
