package com.healthedge.test;

public class StringCalculator {

	public int add(String input){
		if(input == null || input.isEmpty()){
			return 0;
		}
		return Integer.parseInt(input);
	}
}
