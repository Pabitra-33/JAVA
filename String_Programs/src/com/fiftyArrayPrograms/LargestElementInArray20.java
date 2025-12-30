package com.fiftyArrayPrograms;

public class LargestElementInArray20 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 6};

        // Assume first element is the largest
        int max = arr[0];

        // Traverse the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update maximum
            }
        }

        // Print the largest element
        System.out.println("Largest element: " + max);
    }
}