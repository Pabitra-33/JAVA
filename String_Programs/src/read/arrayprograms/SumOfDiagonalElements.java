package read.arrayprograms;

public class SumOfDiagonalElements {
	public static void main(String[] args) {
		int[][] b = {{3,2,5},{1,6,9},{4,7,10}};
		System.out.println("Sum of Diagonals is: "+sumOfDiagonals(b));//19
	}

	private static int sumOfDiagonals(int[][] ele) {
		int sum = 0;
		for(int i =0; i<ele.length; i++) {
			sum += ele[i][i];
		}
		return sum;
	}
}