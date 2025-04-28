package com.operators;

import java.util.Scanner;

public class ArithmaticOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		double num1 = sc.nextDouble();

		System.out.print("Enter the second number: ");
		double num2 = sc.nextDouble();

		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;
		double quotient = num1 / num2;

		System.out.println("The sum of the two numbers is: " + sum);
		System.out.println("The difference of the two numbers is: " + difference);
		System.out.println("The product of the two numbers is: " + product);
		System.out.println("The quotient of the two numbers is: " + quotient);
		
		sc.close();
	}
}
