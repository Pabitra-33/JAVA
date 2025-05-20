package com.abstraction;

//abstract class
abstract class Shape {
    abstract double area();//abstract method
}

class Circle extends Shape {
    private double radius;//private data member

    //constructor
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;//area of circle
    }
}

class Rectangle extends Shape {
    private double width;//private data members
    private double height;

    //constructor to initialize the non-static data members
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;//area of rectangle
    }
}
public class AreaDriver {
	public static void main(String[] args) {
		Shape s1 = new Circle(30);
		System.out.println("Circle area: "+ s1.area());
		
		Shape s2 = new Rectangle(20, 30);
		System.out.println("Rectangle area: "+ s2.area());
	}
}