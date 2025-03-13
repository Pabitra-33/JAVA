package com.basic_progms;

import java.util.Scanner;

public class ChoiceFunctionalities {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
		  
        System.out.println("Select an option: \n1. Print a message\n2.Perform a calculation\n3. Exit");  
//        System.out.println("1. Print a message");  
//        System.out.println("2. Perform a calculation");
//        System.out.println("3. Exit");  
  
        int choice = scanner.nextInt();  
  
        switch (choice) {  
            case 1:  
                System.out.println("You selected to print a message.");  
                System.out.println("Enter the message:");  
                scanner.nextLine(); // Consume the newline character  
                String message = scanner.nextLine();  
                System.out.println("Message: " + message);  
                break;  
            case 2:  
                System.out.println("You selected to perform a addition calculation.");  
                System.out.println("Enter two numbers:");  
                int num1 = scanner.nextInt();  
                int num2 = scanner.nextInt();  
                System.out.println("Sum: " + (num1 + num2));  
                break;  
            case 3:  
                System.out.println("Exiting program. Thank You!");  
                break;
            default:  
                System.out.println("Invalid choice. Please select a valid option.");  
        }  
  
        scanner.close();  
    }  
}