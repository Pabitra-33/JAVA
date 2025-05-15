package read.arraysSorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		//In bubble sorting, we are taking two elements and compare their values.
		//If the first value is larger than second, then we are swapping it.
		int[] a = {3,4,6,8,2,5,9,1};
		System.out.println(Arrays.toString(a));//before sort: 3, 4, 6, 8, 2, 5, 9, 1
		sort(a);
		System.out.println(Arrays.toString(a));//after sort: 1, 2, 3, 4, 5, 6, 8, 9
	}

	private static void sort(int[] arr) {
		//to traverse each of the element
	    for(int i=0; i<arr.length-1; i++)
		{
	    	//to traverse each time less than till i size, because each time the large element will place at the end only.
			for(int j=0; j<arr.length-1-i;j++)
		    {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];//swap them
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}