package com.tcs.demo2;

public class Child extends Parent {

	private String type;
	protected String name = "Child";
	
	public Child() {
		super();
		System.out.println("I am  Child class default Constructor");
	}
	
	public Child(String name) {
		super(name);
		System.out.println("I am from Child class");
	}	
	
	public void test() {
		System.out.println(super.name);
	}
}
