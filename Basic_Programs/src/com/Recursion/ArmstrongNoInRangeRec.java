package com.Recursion;

import java.util.Scanner;

public class ArmstrongNoInRangeRec {
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = s.nextInt();
        System.out.println("Enter last number: ");
        int last = s.nextInt();
        
        for(int i=first; i<=last; i++)
        {
        	int count = count(i);
            int sum = isArmstrong(i,count);
            if(sum == i) System.out.println(i+" ");
        }
        s.close();//closed the connection
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
