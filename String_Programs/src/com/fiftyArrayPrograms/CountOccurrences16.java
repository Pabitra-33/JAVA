package com.fiftyArrayPrograms;

public class CountOccurrences16 {
	//main method
	public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2, 4};//given array
        boolean[] visited = new boolean[arr.length]; // to avoid recounting

        //looping through the array
        for (int i = 0; i < arr.length; i++) {

            // Skip if already counted
            if (visited[i]) {
                continue;
            }

            int count = 1; // current element count

            // Count occurrences
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark as counted
                }
            }

            // Print output of the character with the count
            System.out.println(arr[i] + " - " + count);
        }
    }
}