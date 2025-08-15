package com.InterviewPrograms;

//not adding the middle element two times
public class DiagonalSumWithoutRepeatation {
	public static void main(String[] args) {
		int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
		
		int len = numbers.length; // size of matrix
		int primarySum = 0;
		int secondarySum = 0;
		
		for(int i=0; i<len; i++) {
			
			// Primary diagonal (top-left to bottom-right)
            primarySum += numbers[i][i];

            // Secondary diagonal (top-right to bottom-left)
            secondarySum += numbers[i][len - 1 - i];
		}
		
		int total = primarySum + secondarySum;
		if (len % 2 == 1) {
		    total -= numbers[len / 2][len / 2]; // remove middle element once
		}
		System.out.println("Total of both diagonals (no double count): " + total);
	}
}