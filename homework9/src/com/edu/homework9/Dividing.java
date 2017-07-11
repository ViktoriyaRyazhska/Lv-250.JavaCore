package com.edu.homework9;

public class Dividing {

	public static void main(String[] args) {
		
		try {
			System.out.println(div(5.355, 0.008));
		}
		catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}

	}
	
	static double div(double number1, double number2) {
		if (number2 == 0) {
			throw new ArithmeticException("Dividing by zero");
		}
		return number1 / number2;
	}

}
