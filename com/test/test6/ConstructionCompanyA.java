package com.test.test6;

public abstract class ConstructionCompanyA implements Buildable{

	@Override
	public void constructRoad() {
		System.out.println("Constructing road");
	}

	public abstract void constructBridge();

}
