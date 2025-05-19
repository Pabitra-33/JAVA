package read.arraypatterns;

public class SpiralPattern {
	public static void main(String[] args) {
		int[][] a = Spiral(5);
		for(int[] t:a) {
			for(int n:t) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}
	static int[][] Spiral(int size)
	{
		int[][] a = new int[size][size];
		
		int row = 0, col = -1;
		//char d = 'r';
		String dir = "right";
		for(int i=1; i<= size*size; i++)
		{
			switch (dir) {
			  case "right": 
				  col++;
				  a[row][col] = i;
				  if(col==size-1-row) dir = "down";
				  //if(col == size-1 || a[row][col] != 0) dir = "down";
				  break;
			
			  case "down":
				  row++;
				  a[row][col] = i;
				  if(row == col) dir = "left";
				  //if(row == size-1 || a[row][col] != 0) dir = "left";
				  break;
				  
			  case "left":
				  col--;
				  a[row][col] = i;
				  if(row+col == size-1) dir = "upward";
				  //if(col == 0 || a[row][col] != 0) dir = "upward";
				  break;
				  
			  case "upward":
				  row--;
				  a[row][col] = i;
				  if(row-col == 1) dir="right";
				  //if(row == 1 || a[row][col] != 0) dir = "right";
				  break;
			}
		}
		return a;
	}
}