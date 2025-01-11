package com.Recursion;

import java.util.Scanner;

public class HighestArmstrongNoInRangeRec {
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int st = s.nextInt();
        System.out.println("Enter last number: ");
        int en = s.nextInt();
        
        for(int i=en; i>=st; i--)
        {
        	int count = count(i);
            int sum = isArmstrong(i,count);
            if(sum == i) {
            	System.out.println(i+" ");
            	break;
            }
        }
    }

    public static int isArmstrong(int n, int count){
        if(n==0) return 0;
        return (int)Math.pow(n%10,count)+isArmstrong(n/10,count);
    }

    public static int count(int n){
        if(n == 0) return 0;
        return 1 + count(n/10);
    }
}
