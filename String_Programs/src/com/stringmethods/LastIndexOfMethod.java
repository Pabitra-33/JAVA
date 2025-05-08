package com.stringmethods;

public class LastIndexOfMethod {
	public static void main(String[] args) {
		// Creating a string
        String s = new String("Hello World");
        
        // Printing message before finding last index of 'l'
        System.out.print("Found Last Index of l at: ");
        
        // Finding and printing the last index of 'l'
        System.out.println(s.lastIndexOf('l'));//9 at World word
	}
}