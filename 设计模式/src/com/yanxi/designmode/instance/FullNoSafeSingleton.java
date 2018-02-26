package com.yanxi.designmode.instance;
/**
 * 饱汉式单例-不安全
 * @author 邹丹丹
 *
 */
public class FullNoSafeSingleton {
	private FullNoSafeSingleton(){}
	private static FullNoSafeSingleton fullSingleton=null;
	public static FullNoSafeSingleton getinstance(){
		if (fullSingleton==null) {
			fullSingleton=new FullNoSafeSingleton();
		}
		return fullSingleton;
	}

}
