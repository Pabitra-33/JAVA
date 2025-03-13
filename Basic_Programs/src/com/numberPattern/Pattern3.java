package com.numberPattern;
import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
        System.out.println("Enter a number: ");
        try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int k = 1;
			
			//outer loop 
			for (int i = 1; i <= n; i++){  
				//inner loop
				for (int j = 1; j< i + 1; j++) {
					//prints the value of k  
			        System.out.print(k++ + " ");
			    } 
			    //throws the cursor at the next line  
			    System.out.println();
			}
		}
    }
}