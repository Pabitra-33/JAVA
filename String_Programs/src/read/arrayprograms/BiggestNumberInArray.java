package read.arrayprograms;

public class BiggestNumberInArray {
	public static void main(String[] args) {
		int[] arr = {4,7,2,3,1,9};
		
		//take the first element as big and check with other elements
		int biggest = arr[0];
		
		//iterate and check with each element
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > biggest) {
				biggest = arr[i];//found the biggest
			}
		}
		System.out.println("Biggest element in the array is: "+biggest);
	}
}