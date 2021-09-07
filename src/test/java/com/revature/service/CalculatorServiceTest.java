package com.revature.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

	private CalculatorService calculatorService;
	
	@BeforeEach
	public void setUp() {
		this.calculatorService = new CalculatorService();
	}
	
	@Test
	public void test_add_2_and_2_is_4() {
		double expected = this.calculatorService.add(2, 2);
		
		assertEquals(expected, 4.0);
	}
	
}
