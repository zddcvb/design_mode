package com.yanxi.designmode.instance;
/**
 * 饱汉式单例-安全
 * @author 邹丹丹
 *
 */
public class FullSafeSingleton {
	private FullSafeSingleton(){}
	private static FullSafeSingleton fullSingleton=null;
	public static synchronized FullSafeSingleton getinstance(){
		if (fullSingleton==null) {
			fullSingleton=new FullSafeSingleton();
		}
		return fullSingleton;
	}
}
