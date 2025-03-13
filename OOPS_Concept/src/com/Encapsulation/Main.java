package com.Encapsulation;

class Area {
    private int length; // this value stores length
    private int breadth; // this value stores breadth

    // constructor to initialize values
    Area(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    // method to calculate area
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Area rectangle = new Area(2, 16);
        rectangle.getArea();
    }
}
