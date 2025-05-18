package read.arrayprograms;

public class SecondSmallestNoInArray {
	public static void main(String[] args) {
		//given array
		int[] ele = {3,2,5,7,9,6,4};
		
		//take two variable
		int smallest = ele[0];
		int secSmallest = ele[0];
		
		//traversing the array
		for(int i =0; i<ele.length; i++) {
			//skipping the first iteration,
			//as the smallest and element is same
			if(ele[i] == smallest) {
				continue;
			}
			else if(ele[i] < smallest) {
				secSmallest = smallest;
				smallest = ele[i];
			}
			else if(ele[i] < secSmallest || smallest == secSmallest) {
				secSmallest = ele[i];
			}
		}
		System.out.println("Second Smallest element is: "+secSmallest);//3
	}
}