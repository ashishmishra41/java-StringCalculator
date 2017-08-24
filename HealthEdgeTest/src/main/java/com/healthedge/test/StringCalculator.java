package com.healthedge.test;

public class StringCalculator {

	private String delimiter = ",|\n";

	public int add(String input) {
		String numberToAdd = input;
		String numbers[] = null;
		if (input==null || input.isEmpty()) {
			return 0;
		}
		if (input.startsWith("//")) {
			String[] delimWithNumber = input.split("\n", 2);
			numberToAdd = delimWithNumber[1];
			delimiter = delimWithNumber[0].substring(2) + "|\n";
		}
		numbers = numberToAdd.split(delimiter);
		return addNumbers(numbers);
	}

	private int addNumbers(String[] numbers) {
		int sumOfNumbers = 0;
		for (String number : numbers) {
			sumOfNumbers = sumOfNumbers + Integer.parseInt(number);
		}
		return sumOfNumbers;
	}
}
