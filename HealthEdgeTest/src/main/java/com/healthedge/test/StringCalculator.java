package com.healthedge.test;

public class StringCalculator {

	private String delimiter = ",";

	public int add(String input) {

		if (input == null || input.isEmpty()) {
			return 0;
		}
		return addNumbers(input.split(delimiter));
	}

	private int addNumbers(String[] numbers) {
		int sumOfNumbers = 0;
		sumOfNumbers = numbers.length == 1 ? Integer.parseInt(numbers[0])
				: (Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));
		return sumOfNumbers;
	}
}
