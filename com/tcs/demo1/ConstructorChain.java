package com.tcs.demo1;

public class ConstructorChain {

	private String id;
	private String name;
	private String address;
	private String mobNo;

	public ConstructorChain() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorChain(String id) {
		this();
		this.id = id;
		System.out.println("Constructor with one parameter.");
	}
	
	public ConstructorChain(String id, String name) {
		this(id);
		this.name = name;
		System.out.println("Constructor with two parameters.");
	}
	
	public ConstructorChain(String id, String name, String address) {
		this(id, name);
		this.address = address;
		System.out.println("Constructor with three parameters.");
	}
	
	public ConstructorChain(String id, String name, String address, String mobNo) {
		this(id, name, address);
		this.mobNo = mobNo;
		System.out.println("Constructor with four parameters.");
	}
	
}
