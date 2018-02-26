package com.yanxi.designmode.proxy;

public class Proxy implements ProxyInterface {
	private ProxyInterface proxyInterface;
	public Proxy() {
		proxyInterface = new ProxyObject();
	}
	@Override
	public void methon1() {
		Before();
		proxyInterface.methon1();
		after();

	}
	private void after() {
		System.out.println("proxy after");
	}
	private void Before() {
		System.out.println("proxy before");
	}

}
