package com.loops;

public class ForEachLoop {
	public static void main(String[] args) {
		// declares an Array of integers.
        int[] arr;
 
        // allocating memory for 6 integers.
        arr = new int[6];
         
        System.out.print("Elements of array are: ");
        
        // initialize the elements of the array from first to last(sixth) element
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;	
        arr[5] = 60;
           
        //traversing and printing the elements
        for(int ele : arr) {
        	System.out.print(ele+" ");
        }
 	}
}
