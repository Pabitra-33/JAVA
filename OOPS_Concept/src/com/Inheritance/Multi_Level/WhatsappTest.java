package com.Inheritance.Multi_Level;

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
		WhatsappVersion_1 w1 = new WhatsappVersion_1();
		w1.textMsg();
		//w1.audioMsg();//child specific props we can't access using parent reference
		
		System.out.println("========================");
		
		WhatsappVersion_2 w2 = new WhatsappVersion_2();
		w2.textMsg();
		w2.audioMsg();
		//w2.videoMsg();//CTE
		
		System.out.println("========================");
		
		WhatsappVersion_3 w3 = new WhatsappVersion_3();
		w3.textMsg();
		w3.audioMsg();
		w3.videoCall();
	}
}
