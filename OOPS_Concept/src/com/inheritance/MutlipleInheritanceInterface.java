package com.inheritance;

//interface1
interface Coder {
	void writeCode();
}
//interface2
interface Tester {
	void testCode();
}

//class implementing multiple interfaces two achieve multiple inheritance
class SoftwareEngineers implements Coder, Tester {

	@Override
	public void testCode() {
		System.out.println("Software Engineers will test the code.");
	}

	@Override
	public void writeCode() {
		System.out.println("Software Engineers will write the code.");
	}
	
	public void deployCode() {
		System.out.println("Software Engineers will deploy the code in the cloud.");
	}
	
}
public class MutlipleInheritanceInterface {
	public static void main(String[] args) {
		SoftwareEngineers sEngineers = new SoftwareEngineers();
		sEngineers.writeCode();
		sEngineers.testCode();
		sEngineers.deployCode();
	}
	
}