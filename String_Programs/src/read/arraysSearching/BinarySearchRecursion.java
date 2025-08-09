package read.arraysSearching;

public class BinarySearchRecursion {
	public static void main(String[] args) {
		int[] a = {3,5,7,9,10,12};
		
		System.out.println(search(a, 10, 0, a.length-1));//4(Element found at index 4)
		System.out.println(search(a, 7, 0, a.length-1));//2(Element found at index 2)
		System.out.println(search(a, 2, 0, a.length-1));//-1(Element not found)
	}

	private static int search(int[] arr, int key, int start, int end) {
		if(start > end) 
			return -1;
		
		//find the mid
		int mid = (start+end)/2;
		if(key == arr[mid]) {
			return mid;
		}
		else if(key < arr[mid]) {
			return search(arr, key, start, mid-1);
		}
		else if(key > arr[mid]) {
			return search(arr, key, mid+1, end);
		}
		return mid;
	}
}