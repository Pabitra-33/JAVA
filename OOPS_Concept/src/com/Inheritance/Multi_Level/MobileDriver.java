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
//implementation class
public class MobileDriver {
	public static void main(String[] args) {
		Telephone t1 = new Telephone();
		t1.call();
		
		Nokia n1 = new Nokia();
		n1.call();
		n1.message();
		
		SmartPhone sm = new SmartPhone();
		sm.call();
		sm.message();
		sm.camera();
	}
}
