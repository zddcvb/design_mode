package com.yanxi.designmode.visitor;

public interface VistorSub {
	public void accept(Vistor vistor);
	public Object getSubObject();
}
