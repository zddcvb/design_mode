package com.yanxi.designmode.status;

public class State {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public State() {
		super();
	}

	public State(String value) {
		super();
		this.value = value;
	}
	public void method1() {
		System.out.println("first method1");
	}

	public void method2() {
		System.out.println("second method2");
	}
}
