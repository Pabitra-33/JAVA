package com.cloning;

class Triangle implements Cloneable {
	//Declaring variables - sides of a triangle
	int a,b,c;
	
    //Creating a constructor
	Triangle(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
	}
    
    //Displaying the values by making an instance show()
	void show() {
		System.out.println("Sides of triangle are: "+ a + b + c);
	}
    
	Triangle copy() throws CloneNotSupportedException{
		return (Triangle)this.clone();
	}
}

public class CloningMain {
	public static void main(String[] args) {
		//Creating an object of class Triangle
		Triangle t1 = new Triangle(2,3,5);//created a object with 3sides 2, 3 and 5
		t1.show();
		try {
            //calling copy function to clone the object and then displaying it
			Triangle t2 = t1.copy();
			t2.show(); //same: 2 3 5
		}
        /*catch handler is used if there occurs an exception in try block and 
        prevents abnormal termination of the code*/
        catch(CloneNotSupportedException a){
			System.out.println(a);
		}
	}
}