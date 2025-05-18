package read.arrayprograms;

public class SmallestAndBiggestInArray {
	public static void main(String[] args) {
		//given array
		int[] arr = {3,5,6,9,4,1,7};
		
		//take two variable
		int smallest = arr[0];
		int largest = arr[0];
		
		//iterate and check
		for(int i=0; i<arr.length; i++) {
			//for the smallest number
			if(arr[i] < smallest) {
				smallest = arr[i];//storing the smallest one
			}
			
			//for the largest number
			if(arr[i] > largest) {
				largest = arr[i];//storing  the largest one
			}
		}
		System.out.println("Smallest number: "+smallest);//1
		System.out.println("Biggest number: "+largest);//9
	}
}