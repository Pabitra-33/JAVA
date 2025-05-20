package com.recursion;

import java.util.Scanner;

public class HighestArmstrongNoRec {
	public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = scn.nextInt();
        System.out.println("Enter last number: ");
        int last = scn.nextInt();
        
        for(int i=last; i>= first; i--){
        	int count = count(i);
            int sum = isArmstrong(i,count);
            if(sum == i) {
            	System.out.println(i+" ");
            	break;
            }
        }
        scn.close();
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
