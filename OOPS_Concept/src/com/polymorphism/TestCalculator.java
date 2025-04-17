package com.polymorphism;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class TestCalculator {
	public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 10));       // 15
        System.out.println(c.add(5.5, 4.5));    // 10.0
    }
}