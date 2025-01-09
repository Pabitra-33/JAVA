package com.Recursion;

import java.util.Scanner;

public class ArmstrongNoRec {
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        int count = count(num);
        int sum = isArmstrong(num,count);

        if(sum == num) System.out.println(num+" is a Armstrong Number");
        else System.out.println(num+" is not a Armstrong Number");
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
