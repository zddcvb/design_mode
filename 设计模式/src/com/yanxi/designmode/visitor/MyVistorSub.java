package com.yanxi.designmode.visitor;

public class MyVistorSub implements VistorSub{

	@Override
	public void accept(Vistor vistor) {
		vistor.vistor(this);
	}

	@Override
	public Object getSubObject() {
		System.out.println("getSubObject");
		return "sub";
	}

}
