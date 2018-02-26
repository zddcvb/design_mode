package com.yanxi.designmode.strategy;

public abstract class StrategyAbstract {

	public int[] calculate(String exp,String split){
		String[] strings = exp.split(split);
		int[] arrayInt=new int[2];
		arrayInt[0]=Integer.parseInt(strings[0]);
		arrayInt[1]=Integer.parseInt(strings[1]);
		return arrayInt;
	}

}
