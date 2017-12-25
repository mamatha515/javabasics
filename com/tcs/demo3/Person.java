package com.tcs.demo3;

public class Person {

	public static int uid = 1;
	public String name;
	
	public Person(String name) {
		this.name = name;
		uid++;
	}
}
