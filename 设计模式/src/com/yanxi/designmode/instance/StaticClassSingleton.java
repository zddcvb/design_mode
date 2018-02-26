package com.yanxi.designmode.instance;
/**
 * 静态内部类单例模式
 * @author 邹丹丹
 *
 */
public class StaticClassSingleton {
	private static class SingletonHolder {
		private static StaticClassSingleton singleton=new StaticClassSingleton();
	}
	private StaticClassSingleton(){}
	public static StaticClassSingleton getStaticClassSingleton(){
		return SingletonHolder.singleton;
	}
}
