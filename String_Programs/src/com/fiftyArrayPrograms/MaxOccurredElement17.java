package com.fiftyArrayPrograms;

public class MaxOccurredElement17 {
	//main method
	public static void main(String[] args) {

		//given array
        int[] arr = {1, 2, 1, 3, 1, 4};
        boolean[] visited = new boolean[arr.length];

        //initially taking the maxCount and maxElement as the first element
        int maxCount = 0;
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {

            // Skip already counted elements
            if (visited[i]) {
                continue;
            }

            int count = 1;

            // Count occurrences of arr[i]
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            // Update maximum occurred element
            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Maximum occurred element: " 
                           + maxElement + " - " + maxCount);
    }
	//main method ends
}