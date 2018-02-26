package com.yanxi.designmode.bridge;

public class MyBridge extends BridgeAbstract{

	@Override
	public void method() {
		getBridgeInterface().method();
	}

}
