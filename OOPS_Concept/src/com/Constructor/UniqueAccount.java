package com.Constructor;

public class UniqueAccount {
	int accNo;
	static int n = 1000;
	
	//assigned the initial value to the accountNo then increase it for a new unique value.
	public UniqueAccount() {
		accNo = n;
		n++;
	}
	
	public void display() {
		System.out.println(accNo);
	}
	
	//main method
	public static void main(String[] args) {
		UniqueAccount ua1 = new UniqueAccount();
		UniqueAccount ua2 = new UniqueAccount();
		UniqueAccount ua3 = new UniqueAccount();
		
		ua1.display();
		ua2.display();
		ua3.display();
	}
}
