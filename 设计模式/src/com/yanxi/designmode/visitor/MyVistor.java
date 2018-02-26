package com.yanxi.designmode.visitor;

public class MyVistor implements Vistor{

	@Override
	public void vistor(VistorSub vistorSub) {
		System.out.println("vistorSub:"+vistorSub.getSubObject());
	}

}
