package com.ArrayInterviewPrograms;

public class DiagonalSumOfMatrix {
	public static void main(String[] args) {
		//given matrix
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		int len = matrix.length; // size of matrix
		int primarySum = 0;
		int secondarySum = 0;
		
		for(int i=0; i<len; i++) {
			
			// Primary diagonal (top-left to bottom-right)
            primarySum += matrix[i][i];

            // Secondary diagonal (top-right to bottom-left)
            secondarySum += matrix[i][len - 1 - i];
		}
		
		System.out.println("Primary diagonal sum: " + primarySum);
        System.out.println("Secondary diagonal sum: " + secondarySum);
        System.out.println("Total of both diagonals: " + (primarySum + secondarySum));
	}
}