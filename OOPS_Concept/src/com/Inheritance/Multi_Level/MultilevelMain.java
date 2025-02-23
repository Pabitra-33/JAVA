package com.Inheritance.Multi_Level;

//Parent class
class Animal {
 void eat() {
     System.out.println("Animal is eating");
 }
}

//Child class inheriting from Animal
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking");
 }
}

//Sub-child class inheriting from Dog
class Labrador extends Dog {
 void display() {
     System.out.println("Labrador is a type of Dog");
 }
}

public class MultilevelMain {
 public static void main(String[] args) {
     Labrador labrador = new Labrador();
     labrador.eat();   // Animal is eating (Inherited from Animal)
     labrador.bark();  // Dog is barking (Inherited from Dog)
     labrador.display();  // Labrador is a type of Dog (Defined in Labrador class)
 }
}