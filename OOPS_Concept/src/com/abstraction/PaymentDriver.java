package com.abstraction;

import java.util.Scanner;

//functional interface
@FunctionalInterface
interface Payable {
	void pay();
}

class UPI implements Payable {
	@Override
	public void pay() {
		System.out.println("Paid by UPI");
	}
}

class CreditCard implements Payable {
	@Override
	public void pay() {
		System.out.println("Paid by Credit Card");
	}
}

class NetBanking implements Payable {
	@Override
	public void pay() {
		System.out.println("Paid by Net Banking");
	}
}

class Payment {
	public static Payable getInst() {
		//for closing the scanner connection internally, we are using try-with resource
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("1. UPI\n2.Credit Card\n3.Net Banking");
			int n = sc.nextInt();
			if(n == 1) return new UPI();
			else if(n == 2) return new CreditCard();
			else if(n == 3) return new NetBanking();
			else return null;
		}
		
	}
}
public class PaymentDriver {
	public static void main(String[] args) {
		Payable p = Payment.getInst();
		p.pay();
	}
}
