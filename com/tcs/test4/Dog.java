package com.tcs.test4;

public class Dog extends Animal {

	public String name;
	protected String age;
	private String type;
	
	
	private Dog() {
		this.type = type;
	}
	
	public Dog(String name, String weight, String type) {
		super(name, weight);
		this.type = type;
	}
	
	protected Dog(String name, String weight, String type, String color) {
		super(name, weight);
		this.type = type;
	}

	@Override
	public void eat() {
		System.out.println("Hey! I am dog, I eat in my own way");
	}

}
