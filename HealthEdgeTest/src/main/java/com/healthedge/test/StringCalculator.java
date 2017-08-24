package com.healthedge.test;

public class StringCalculator {

	private String delimiter = ",|\n";

	public int add(String input) {

		if (input == null || input.isEmpty()) {
			return 0;
		}
		return addNumbers(input.split(delimiter));
	}

	private int addNumbers(String[] numbers){
		int sumOfNumbers = 0;
		for(String number : numbers){
			sumOfNumbers = sumOfNumbers + Integer.parseInt(number);
		}
		return sumOfNumbers;
	}
}
