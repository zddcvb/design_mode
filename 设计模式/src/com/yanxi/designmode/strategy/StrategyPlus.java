package com.yanxi.designmode.strategy;

public class StrategyPlus extends StrategyAbstract implements StrategyInterface{

	@Override
	public int calculate(String exp) {
		int[] arrayInt = calculate(exp, "\\+");
		return arrayInt[0]+arrayInt[1];
	}

}
