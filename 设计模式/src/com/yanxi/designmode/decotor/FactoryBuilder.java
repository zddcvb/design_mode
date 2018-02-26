package com.yanxi.designmode.decotor;

public class FactoryBuilder implements Builder {
	private Builder builder;
	public FactoryBuilder(Builder builder) {
		this.builder = builder;
	}
	@Override
	public void print() {
		System.out.println(" decotor start");
		builder.print();
		System.out.println("decotor end");
	}

}
