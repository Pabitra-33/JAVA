package com.overloadingAndoverriding;

class Whatsapp_1 {
	void sentMsg() {
		System.out.println("single Tick");
	}
}

class Whatsapp_2 extends Whatsapp_1 {
	@Override
	void sentMsg() {
		System.out.println("Double Tick");
	}
	
	//specific method
	void voiceMsg() {
		System.out.println("Voice Note");
	}
}

class Whatsapp_3 extends Whatsapp_2 {
	@Override
	void sentMsg() {
		System.out.println("Double Blue Tick");
	}
	
	void videoCall() {
		System.out.println("Video Call get Connected");
	}
}

class whatsapp_4 extends Whatsapp_3 {
	@Override
	void videoCall() {
		System.out.println("HD Video Call");
	}
}

//implementation class(Execution Class)
public class OverridingWhatsappMultilevel {
	public static void main(String[] args) {
		
	}
}
