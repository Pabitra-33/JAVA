package read.arraysSearching;

public class BinarySearching {
	public static void main(String[] args) {
		int[] a = {3,5,7,9,10,12};
		int target = 9;
		
		int index = search(a, target);
		
		if(index == -1) 
			System.out.println("Element not found in the array");
		else 
			System.out.println("Element found in the array at index: "+ index);
	}

	//finding the element in the array logic
	private static int search(int[] a, int key) {
		int start = 0;//starting as first element
		int end = a.length-1;//last element as end
		
		//till they don't overlap each other check
		while(start <= end) {
			//find the mid element
			int mid = (start + end)/2;
			if(key == a[mid]) {
				return mid;
			}
			else if(key < a[mid]) {
				end = mid -1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
}