package read.arrayprograms;

public class SmallestNumberInArray {
	public static void main(String[] args) {
		int[] array = {2,4,3,6,9,1};//given array
		
		//taking the first element as the smallest element
		//and then checking it with other elements
		int smallest = array[0];
		
		//iterate the array and check with other elements
		for(int i = 0; i<array.length; i++) {
			if(array[i] < smallest) {
				smallest = array[i];//change the smallest to the array[i]
			}
		}
		System.out.println("Smallest No in the array: "+smallest);//1
	}
}