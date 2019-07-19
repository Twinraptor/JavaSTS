package com.codingdojo.calculator;

public class Calculator implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double operandOne=0.0;
	private double operandTwo=0.0;
	private String operation;
	private double results;
	public Calculator() {
		
	}
	
	public double performOperation() {
		if (operation == "+") {
		setResults(getOperandOne() + getOperandTwo());
		} else {
			setResults(getOperandOne() - getOperandTwo());
		}
		return getResults();
	}
	
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResults() {
		return results;
	}

	public void setResults(double results) {
		System.out.println(results);
		this.results = results;
	}
	
}
