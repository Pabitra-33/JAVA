package com.fiftyArrayPrograms;

public class MinOccurredElementInArray18 {
	public class MinOccurredElement {
	    public static void main(String[] args) {

	        int[] arr = {1, 2, 1, 3, 1, 4};//given array
	        boolean[] visited = new boolean[arr.length];

	        int minCount = arr.length;
	        int minElement = arr[0];

	        for (int i = 0; i < arr.length; i++) {

	            // Skip already counted elements
	            if (visited[i]) {
	                continue;
	            }

	            int count = 1;

	            // Count occurrences
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    visited[j] = true;
	                }
	            }

	            // Update minimum occurred element
	            if (count < minCount) {
	                minCount = count;
	                minElement = arr[i];
	            }
	        }

	        System.out.println("Minimum occurred element: "
	                           + minElement + " - " + minCount);
	    }
	}
}