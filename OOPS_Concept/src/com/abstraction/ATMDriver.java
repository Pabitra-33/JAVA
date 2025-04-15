package com.abstraction;

abstract class ATM {
    public abstract void withdraw(int amount);

    public void showMessage() {
        System.out.println("Please follow the instructions on the screen.");
    }
}

class BankATM extends ATM {
    @Override
    public void withdraw(int amount) {
        System.out.println("Dispensing " + amount + " rupees.");
    }
}

public class ATMDriver {
    public static void main(String[] args) {
        ATM myATM = new BankATM();
        myATM.showMessage(); // Output: Please follow the instructions on the screen.
        myATM.withdraw(100); // Output: Dispensing 100 rupees.
    }
}