package com.fiftyArrayPrograms;

public class SecondSmallest23 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2, 4};//given array

        //by default making the first and second smallest as MaxValue
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        //iterating the array using loop
        for (int i = 0; i < arr.length; i++) {

        	//checking the array element one by one with the smallest element i have assigned
            if (arr[i] < smallest) {
                secondSmallest = smallest;//if it lesser than the smallest then updating the smallest element
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        //printing the second smallest element from the array in the console
        System.out.println("Second smallest element: " + secondSmallest);
    }
}