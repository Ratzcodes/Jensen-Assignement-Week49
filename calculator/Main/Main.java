package com.week49.calculator.Main;

import com.week49.calculator.classes.ScientificCalculator;
import com.week49.calculator.classes.SimpleCalculator;

public class Main {

	public static void main(String[] args) {
		
		// create objects to access the classes of calculator
		SimpleCalculator simple = new SimpleCalculator();
		
		ScientificCalculator scientific = new ScientificCalculator();
		
		System.out.println(simple.addition(12, 20));
		System.out.println(simple.subtraction(23.786,1.67));
		System.out.println(simple.multiplication(2, 67));
		System.out.println(simple.division(12,0));
		
		scientific.square(25);
		scientific.raisedToThePowerOf(12, 2);
		System.out.println(scientific.remainder(125,4));

	}

}
