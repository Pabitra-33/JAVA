package read.arraypatterns;

import java.util.Scanner;

public class PascalTraingle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Pascal triangle:");
		int n = sc.nextInt();
		int[][] a = Pascal(n);
		sc.close();
		for(int i=0; i<a.length; i++)
		{
			for (int j = n; j >= 0; j--) {
				System.out.print(" ");
			}
			n--;
			for(int j=0; j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();//adding new line
		}
	}
	
	static int[][] Pascal(int size)
	{
		int[][] a = new int[size][];
		
		for(int i=0; i<a.length; i++) {
			a[i] = new int[i+1];
			for(int j=0; j<a[i].length; j++) {
				if(j==0 || i==j) {
					a[i][j] = 1;
				}
				else {
					a[i][j] = a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		return a;
	}
}