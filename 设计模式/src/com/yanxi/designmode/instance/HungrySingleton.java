package com.yanxi.designmode.instance;
/**
 * 饿汉式单例模式
 * @author 邹丹丹
 *
 */
public class HungrySingleton {
	
	private HungrySingleton(){}
	
	private static HungrySingleton hungrySingleton=new HungrySingleton();
	
	public static  HungrySingleton getInstance(){
		return hungrySingleton;
	}

}
