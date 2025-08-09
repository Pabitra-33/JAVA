package read.arrayprograms;

public class MatrixMultiplication {
	public static void main(String[] args) {
		//creating two 2D array to make them as a matrix
		int[][] a = {{1,2,3},{3,2,1},{2,7,1}};
		int[][] b = {{3,1,3},{3,5,2},{1,2,9}};
		
		//create a new array
		int[][] c = multiply(a,b);
		
		//iterate and print
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();//add a new line
		}
	}

	private static int[][] multiply(int[][] arr, int[][] brr) {
		int len = arr.length;
		
		//create a new array of the multiple size of these two array
		//to store the sum
		int[][] crr = new int[len][len];
		
		for(int i =0; i<len; i++) {
			for(int j =0; j<len; j++) {
				for(int k =0; k<len; k++) {
					crr[i][j] += arr[i][k] * arr[k][i];//multiplying and adding to the sum
				}
			}
		}
		return crr;
	}
}