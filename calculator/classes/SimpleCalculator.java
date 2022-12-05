package com.week49.calculator.classes;

import com.week49.calculator.interfaces.BasicMathOperations;

public class SimpleCalculator implements BasicMathOperations {

	@Override
	public double addition(double firstNumber, double secondNumber) {
		return firstNumber+secondNumber;
	}

	@Override
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber-secondNumber;
	}

	@Override
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber*secondNumber;
	}

	@Override
	public double division(double firstNumber, double secondNumber) {
		double result = firstNumber/secondNumber;
		if(Double.isInfinite(result)) {
			System.out.println("Divide by zero is not possible.");
			return -0.123456789;
		}else {
			return result;
		}
		
	}

}
