package com.Inheritance.Multiple;

//interface character
interface Character {  
    void attack(); //attack method 
}  
//interface weapon
interface Weapon {  
    void use();//use method  
}

//performing multiple inheritance
class Warrior implements Character, Weapon{
	//overriding unimplemented class
	@Override
	public void use() {
		System.out.println("Warrior uses a sword to attack");
	}

	@Override
	public void attack() {
		System.out.println("Warrior attacks with a sword");	
	}
}

public class MultipleInheritanceUsingInterface{
	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		warrior.attack();//Warrior attacks with a sword
		warrior.use();//Warrior uses a sword to attack
	}
}