package com.Searching;

public class LinearSearch {
	public static void main(String[] args){
        int[] arr = {1,3,5,2,4,6,7};
        System.out.println(search(arr, 4));
        System.out.println(search(arr,9));
    }

	private static int search(int[] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key)
				return i;//element found index
		}
		return -1;//element not found
	}
	
}
