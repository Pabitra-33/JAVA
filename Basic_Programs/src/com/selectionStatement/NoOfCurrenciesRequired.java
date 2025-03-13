package com.selectionStatement;

import java.util.Scanner;

public class NoOfCurrenciesRequired {
	public static void main(String[] args) {
		//try-with resources
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter an amount: ");
			int amount = sc.nextInt();
			
			if(amount >= 2000) {
				System.out.println("2000 X "+(amount/2000));
				amount %= 2000;
			}
			if(amount >= 500) {
				System.out.println("500 X "+(amount/500));
				amount %= 500;
			}
			if(amount >= 200) {
				System.out.println("200 X "+(amount/200));
				amount %= 200;
			}
			if(amount >= 100) {
				System.out.println("100 X "+(amount/100));
				amount %= 100;
			}
			if(amount >= 50) {
				System.out.println("50 X "+(amount/50));
				amount %= 50;
			}
		}
	}
}
