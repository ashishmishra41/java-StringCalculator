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

}
