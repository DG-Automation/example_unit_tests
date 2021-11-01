package com.dgautomation.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator;

	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("Simple multiplication should work")
	void testMultiply() {
		assertEquals(20, calculator.multiply(4, 5),
				"Regular multiplication should work");
	}

	@Test
	@DisplayName("Simple addition should work")
	void testAddition() {
		assertEquals(9, calculator.addition(4, 5),
				"Regular addition should work");
	}
}
