package com.Inheritance.Multi_Level;

//parent class
class Telephone {
	//calling method
	public void call() {
		System.out.println("📞 Calling Feature Of Telephone");
	}
}

//child class extends Telephone
class Nokia extends Telephone {
	public void message() {
		System.out.println("✉ Message Feature Of Nokia");
	}
}

//child class SmartPhone extends Nokia
class SmartPhone extends Nokia {
	public void camera() {
		System.out.println("📸 Camera Feature Of Smartphone");
	}
}
public class MobileDriver {

}
