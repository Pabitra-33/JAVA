package com.Inheritance.Hierarchical;

//Generalized Superclass
class Vehicle {
 int speed;
 String color;
 void start() {
     System.out.println("Vehicle is starting");
 }
 void stop() {
     System.out.println("Vehicle is stopping");
 }
}

//Specific Subclasses
class Car extends Vehicle {
 void openSunroof() {
     System.out.println("Sunroof is open");
 }
}

class Bike extends Vehicle {
 void wheelie() {
     System.out.println("Bike is doing a wheelie");
 }
}

public class GeneralizationTest {
 public static void main(String[] args) {
     Car myCar = new Car();
     myCar.start(); // Output: Vehicle is starting
     myCar.openSunroof();

     Bike myBike = new Bike();
     myBike.start(); // Output: Vehicle is starting
     myBike.wheelie();
 }
}
