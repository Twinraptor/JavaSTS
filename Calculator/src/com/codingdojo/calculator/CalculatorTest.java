package com.codingdojo.calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator d=new Calculator();
		d.setOperandOne(10.5);
		d.setOperation("+");
		d.setOperandTwo(5.2);
		d.performOperation();
		d.getResults();
	}
}
