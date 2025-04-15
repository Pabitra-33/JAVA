package com.abstraction;

abstract class Bank {
	abstract int getrateofInt();//abstract method
	
	//constructor
	Bank(){
		System.out.println("Bank Constructor...");
	}
}

class SBI extends Bank {
	@Override
	int getrateofInt() {
		return 10;
	}
	
	//constructor
	SBI(){
		System.out.println("SBI Constructor");
	}
}

class ICICI extends Bank {
	@Override
	int getrateofInt() {
		return 11;
	}
}

public class BankDriver {
	public static void main(String[] args) {
		Bank bank1 = new SBI();
		System.out.println(bank1.getrateofInt()+" SBI RateOfInterest");
		
		Bank bank2 = new ICICI();
		System.out.println(bank2.getrateofInt()+" ICICI RateOfInterest");
	}
}