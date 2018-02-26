package com.yanxi.designmode.bridge;

public class BridgeAbstract {
	private BridgeInterface bridgeInterface;
	public void method() {
		bridgeInterface.method();
	}
	public BridgeInterface getBridgeInterface() {
		return bridgeInterface;
	}
	public void setBridgeInterface(BridgeInterface bridgeInterface) {
		this.bridgeInterface = bridgeInterface;
	}

}
