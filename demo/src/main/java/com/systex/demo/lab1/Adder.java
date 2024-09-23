package com.systex.demo.lab1;

public class Adder implements Calculator {

	@Override
	public int calculate(int input1, int input2) {
		// TODO Auto-generated method stub
		return input1+input2;
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return "+";
	}

}
