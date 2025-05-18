package read.arrayprograms;

public class SumOfAntiDigonalElements {
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{7,8,9},{13,14,15}};
		System.out.println(sumOfAntiDigonals(a));//40 (sum of anti-diagonals: 1+8+15+3+11)
	}
	
	public static int sumOfAntiDigonals(int[][] arr) {
		int len = arr.length;//finding the length of the array
		int sum = 0; //to store the sum
		
		for(int i =0; i<len; i++) {
			sum += arr[i][i];
			
			//to ignore the middle element,
			//for not adding twice
			if(len % 2 != 0 && i == len/2)
				continue;
			
			sum += arr[i][len-1-i];
		}
		return sum;
	}
}