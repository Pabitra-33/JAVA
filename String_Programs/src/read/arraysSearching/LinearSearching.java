package main.arraysSearching;

public class LinearSearching {
	public static void main(String[] args) {
		int[] arr = {2,5,7,9,3,8,6,1};
		System.out.println(Search(arr, 7));
		System.out.println(Search(arr, 12));
	}

	private static int Search(int[] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) //if element found 
				return i; //return the index
		}
		return -1;//if the element not found then return -1
	}
}