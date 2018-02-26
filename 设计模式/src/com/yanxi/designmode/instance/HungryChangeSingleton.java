package com.yanxi.designmode.instance;
/**
 * 饿汉式变种单例模式
 * 
 * @author 邹丹丹
 *
 */
public class HungryChangeSingleton {

	private static HungryChangeSingleton hungryChangeSingleton = null;
	static {
		hungryChangeSingleton = new HungryChangeSingleton();
	}
	private HungryChangeSingleton() {
	}
	public static HungryChangeSingleton getInstance() {
		return hungryChangeSingleton;
	}

}
