package com.yanxi.designmode.adapter;

public class ObjectAdapter implements ObjectBuilder {
	private Factory factory;
	public ObjectAdapter(Factory factory) {
		this.factory = factory;
	}
	@Override
	public void print() {
		System.out.println("print");
	}
	public void produce() {
		factory.produce();
	}

}
