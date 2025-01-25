package com.basic_progms;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		// Take num
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number greater than 0:");
        int num = sc.nextInt();
        int finalVal = num;
        while (finalVal != 1 && finalVal != 4) {
            finalVal = isNumHappy(finalVal);
        }
        if (finalVal == 1) {
            System.out.println(num+" is a Happy Number");
        } else {
            System.out.println(num+" is not a Happy Number");
        }
	}
	
	public static int isNumHappy(int num) {
        int rem = 0, sum = 0;
        // calculate the sum of squares of each digit
        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }
}
//Time complexity
//O(log N). Here, N represents the number of digits in the given number num.

//Space Complexity
//O(1), as no extra space is needed.
