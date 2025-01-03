package com.Loops;

public class FirstTenEvenNumbers {

	public static void main(String[] args) {
		int count = 0; // Counter to keep track of the number of even numbers printed
        int number = 2; // Start from the first even number

        System.out.println("First 10 Even Numbers are:");

        // Loop until we print 10 even numbers
        while (count < 10) {
            System.out.println(number); // Print the current even number
            number += 2; // Increment by 2 to get the next even number
            count++; // Increment the counter
        }
	}

}
