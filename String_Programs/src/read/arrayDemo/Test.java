package read.arrayDemo;

public class Test {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();//new line
		m1(arr);//calling the method
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	//static method
	static void m1(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i]++;//increasing array each elements
		}
	}
}