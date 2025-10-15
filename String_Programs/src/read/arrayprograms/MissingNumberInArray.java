package read.arrayprograms;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6};
		
		int len = arr.length + 1; //since one number is missing
		
		// Expected sum
		int expectedSum = len * (len + 1) / 2;
		
		// Actual Sum of array numbers
		int actualSum = 0;
		for(int num: arr) {
			actualSum += num;//adding each element in the array
		}
		
		int missing = expectedSum - actualSum;
		
		System.out.println("Missing Number in the array is: "+missing);
	}
}