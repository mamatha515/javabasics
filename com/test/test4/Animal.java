package com.test.test4;


public abstract class Animal {

	private String name;
	private String weight;
	
	Animal(){
		
	}
	
	public Animal(String name, String weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getDetails() {
		return "Name "+name+", Weight "+weight;
	}
	
	public abstract void eat();
	
	//public abstract void eat();
}
