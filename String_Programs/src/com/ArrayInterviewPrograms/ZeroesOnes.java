package com.ArrayInterviewPrograms;

import java.util.Arrays;

//program to move zeros to first and ones to last.

public class ZeroesOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,0,1,0,0};
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        //using the two pointer approach
        int i = 0;
        int j = arr.length - 1;

        //until the condition satisfies run
        while (i < j) {
            while (arr[i] == 0 && i < j) i++;
            while (arr[j] == 1 && i < j) j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
