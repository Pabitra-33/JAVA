package com.hasarelationships;

public class Car {
	private Tyre tyres[] = {new Tyre("appola"), new Tyre("MRF"), new Tyre("CEAT")};

	public Tyre[] getTyres() {
		return tyres;
	}

	public void setTyres(Tyre[] tyres) {
		this.tyres = tyres;
	}
}