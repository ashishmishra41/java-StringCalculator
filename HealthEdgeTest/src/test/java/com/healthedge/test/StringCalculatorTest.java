package com.healthedge.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator calc;

	@Before
	public void init() {
		calc = new StringCalculator();
	}

	@Test
	public void checkForEmptyValue() {
		assertEquals(calc.add(""), 0);
	}
	
	@Test
	public void addSingleNumber(){
		assertEquals(calc.add("1"), 1);
	}
	
	@Test
	public void addTwoNumbersWithDefaultDelimiter(){
		assertEquals(calc.add("1,5"), 6);
	}
	
	@Test
	public void addAnyAmountOfNumber(){
		assertEquals(calc.add("3,5,3,6,2"), 3+5+3+6+2);
	}
	
	@Test
	public void addWithNewLineBetweenTheNumbers(){
		assertEquals(calc.add("1\n2,3"), 6);
	}

}
