package read.arrayprograms;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		//given array
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Before Transpose Of Matrix: ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();//added a new line
		}
		
		System.out.println("After Transpose Of Matrix: ");
		for(int i =0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[j][i]+"\t");
			}
			System.out.println();//added a new line
		}
	}
}