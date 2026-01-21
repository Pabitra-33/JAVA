package com.fiftyArrayPrograms;

public class SecondSmallest23 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2, 4};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second smallest element: " + secondSmallest);
    }
}