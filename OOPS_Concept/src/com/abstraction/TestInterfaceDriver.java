package com.abstraction;

//interface 1
interface Regulator {
	void increaseSpeed();
	void decreaseSpeed();
}

//interface 2
interface Switch {
	void on();
	void off();
}

//class Fan
class Fan implements Regulator, Switch {
	@Override
	public void increaseSpeed() {
		System.out.println("Fan speed increased.");
	}

	@Override
	public void decreaseSpeed() {
		System.out.println("Fan speed decreased.");
	}
	
	@Override
	public void on() {
		System.out.println("Fan is On..");
	}

	@Override
	public void off() {
		System.out.println("Fan is Off..");
	}
}

public class TestInterfaceDriver {
	public static void main(String[] args) {
		Regulator r = new Fan();
		r.increaseSpeed();
		r.decreaseSpeed();
		System.out.println("--------------");
		
		Switch s = new Fan();
		s.on();
		s.off();
		System.out.println("--------------");
		
		Fan f = new Fan();
		f.increaseSpeed();
		f.decreaseSpeed();
		f.on();
		f.off();
	}
}