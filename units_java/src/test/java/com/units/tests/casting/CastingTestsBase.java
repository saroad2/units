package com.units.tests.casting;

import static org.junit.Assert.assertTrue;

public class CastingTestsBase {

	private static final double epsilon = 1e-06;
	
	private double calculateError(double value1, double value2) {
		return Math.abs(value1 - value2); 
	}
	
	protected void checkCastedValue(double castedValue, double expectedValue) {
		double error = calculateError(castedValue, expectedValue); 
		assertTrue(
			"value after casting is " + castedValue + " instead of " + expectedValue
			+ ". error is " + error,
			error < epsilon);
	}
}
