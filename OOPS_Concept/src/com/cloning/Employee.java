package com.cloning;

import java.util.Map;

public class Employee implements Cloneable {
	//private data members
	private int id;
	private String name;
	private Map<String, String> properties;
	
	//getters and setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Map<String, String> getProperties() {
		return properties;
	}
	
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();//calling the parent class clone method, by using super keyword
	}
}