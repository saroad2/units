package com.units.tests.casting;

import static org.junit.Assert.assertTrue;

import com.units.Unit;

public class CastingTestsBase {

	private static final double maxErrorPercent = 1e-8;
	
	private double calculateErrorPercent(double castedValue, double expectedValue) {
		return (castedValue / expectedValue - 1) * 100; 
	}
	
	protected <E extends Unit> void checkCastedValue(E actual, E expected) {
		double error = calculateErrorPercent(actual.value(), expected.value()); 
		assertTrue(
			actual + " != " + expected + "(" + error + "% error)",
			error < maxErrorPercent);
	}
}
