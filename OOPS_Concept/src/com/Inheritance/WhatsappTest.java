package com.Inheritance;

//version-1
class WhatsappVersion_1 {
	//textMsg()
	public void textMsg() {
		System.out.println("Hello welcome to Coding world.. ");
	}
}

//version-2
class WhatsappVersion_2 extends WhatsappVersion_1 {
	//audioMsg()
	public void audioMsg() {
		System.out.println("Hello you are in audio call... ");
	}
}

//
class WhatsappVersion_3 extends WhatsappVersion_2 {
	//textMsg()
	public void videoCall() {
		System.out.println("You are in videocall....");
	}
}

public class WhatsappTest {
	public static void main(String[] args) {
		
	}
}
