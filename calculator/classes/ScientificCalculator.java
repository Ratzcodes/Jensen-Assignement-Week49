package com.week49.calculator.classes;

import com.week49.calculator.interfaces.AdvancedMathOperations;

public class ScientificCalculator implements AdvancedMathOperations {

	@Override
	public double square(double number) {
		return number*number;
	}

	@Override
	public double raisedToThePowerOf(double base, double exponent) {
		return Math.pow(base,exponent);
	}

	@Override
	public double remainder(double dividend, double divisor) {
		return dividend % divisor;
	}

}
