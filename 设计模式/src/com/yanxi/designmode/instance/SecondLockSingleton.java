package com.yanxi.designmode.instance;
/**
 * 双重锁
 * @author 邹丹丹
 *
 */
public class SecondLockSingleton {
	private static SecondLockSingleton singleton=null;
	private SecondLockSingleton(){
		
	}
	public static SecondLockSingleton getSecondLockSingleton(){
		if (singleton==null) {
			synchronized (SecondLockSingleton.class) {
				if (null==singleton) {
					singleton=new SecondLockSingleton();
				}
			}
		}
		return singleton;
	}

}
