package com.Inheritance.Multi_Level;

//parent class
class Telephone {
	//calling method of Telephone class
	public void call() {
		System.out.println("📞 Calling Feature Of Telephone");
	}
}

//child class extends Telephone
class Nokia extends Telephone {
	//message method of Nokia Class
	public void message() {
		System.out.println("✉ Message Feature Of Nokia");
	}
}

//child class SmartPhone extends Nokia
class SmartPhone extends Nokia {
	//camera method of SmartPhone class
	public void camera() {
		System.out.println("📸 Camera Feature Of Smartphone");
	}
}

//implementation class(Execution)
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
