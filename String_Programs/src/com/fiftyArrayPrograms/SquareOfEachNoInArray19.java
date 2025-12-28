package com.fiftyArrayPrograms;

public class SquareOfEachNoInArray19 {
	//main method
	public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};//given array

        System.out.print("Squared elements: ");

        // Looping through array and squaring each element
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
            System.out.print(arr[i] + " ");//just printing the square results
        }
    }
}