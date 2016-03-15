package com.pattern.adapter;

public class Adapter implements Target {

	private Adaptee mAdaptee;

	public Adapter() {
		this.mAdaptee = new Adaptee();
	}

	@Override
	public void doSomething() {
		// System.out.print("Adapter doSomething");
		this.mAdaptee.doSomething();
	}

}
