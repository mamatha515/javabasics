package com.test.demo3;

public class StaticBlock {

	
	static {
		System.out.println("Hello, I am from static");
	}
	
	public StaticBlock() {
		System.out.println("Static block constructor");
	}
}
