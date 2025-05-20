package com.classesAndobjects;

class Rectangle{  
	int length;  
	int width; 
	
	//add length and breadth of rectangle
	void insert(int l, int w){  
		length=l;  
	    width=w;  
	}  
	
	//calculate the area of rectangle
	void calculateArea() {
		System.out.println(length*width);
	}  
}

class TestRectangle {  
	public static void main(String args[]){
		Rectangle r1=new Rectangle(); //object1
		Rectangle r2=new Rectangle(); //object2
	    r1.insert(11,5);
	    r2.insert(3,15);
	    System.out.print("Area of rectangle one: ");
	    r1.calculateArea();
	    System.out.print("Area of rectangle two: ");
	    r2.calculateArea();
	}  
}