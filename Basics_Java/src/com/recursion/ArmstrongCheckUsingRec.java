package com.recursion;

import java.util.Scanner;

public class ArmstrongCheckUsingRec {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num = scanner.nextInt();
		
		int count = count(num);//calling count method to calculate number of digits of number
		int sum = isArmstrong(num, count);//calling the Armstrong check method
		
		if(sum == num) 
			System.out.println(num+" is a Armstrong Number");
        else 
        	System.out.println(num+" is not a Armstrong Number");
		
		scanner.close();
	}
	
	//Armstrong check method
	public static int isArmstrong(int n, int count){
        if(n==0) return 0;
        return (int)Math.pow(n%10,count)+isArmstrong(n/10,count);
    }
	
	//count method
	public static int count(int n){
        if(n == 0) return 0;
        return 1 + count(n/10);//deleting the last digit
    }
}
