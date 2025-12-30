package com.fiftyArrayPrograms;

public class SmallestElementInArray21 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 6};

        // Assume first element is the largest
        int small = arr[0];

        // Traverse the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i]; // update smallest
            }
        }

        // Print the largest element
        System.out.println("Smallest element: " + small);
    }
}