package com.numberprograms;

import java.util.Scanner;

public class SumOfEvenOddNo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int evensum = 0;
		int oddsum = 0;

		while(N > 0){
			int rem = N%10;

			//for even
			if(rem % 2 == 0){
				evensum += rem;
			}
			//odd
			else{
				oddsum += rem;
			}
			N /= 10;
		}
		System.out.println(evensum+" "+oddsum);
		sc.close();	}
}