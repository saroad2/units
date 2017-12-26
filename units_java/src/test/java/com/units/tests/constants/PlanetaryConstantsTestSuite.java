package com.units.tests.constants;

import static org.junit.Assert.assertTrue;

import com.units.acceleration.MetersPerSquareSecond;
import com.units.mass.Kilograms;
import com.units.speed.MetersPerSecond;

public class PlanetaryConstantsTestSuite {

	private double maxErrorPercentage;
	
	public PlanetaryConstantsTestSuite(double maxErrorPercentage) {
		this.maxErrorPercentage = maxErrorPercentage;
	}
	
	protected void checkAcceleration(MetersPerSquareSecond expected, MetersPerSquareSecond actual) {
		double errorPercentage = Math.abs((actual.scalarRatio(expected) - 1) * 100);
		assertTrue(
			expected + " != " + actual + "(" + errorPercentage + "% error)",
			errorPercentage < maxErrorPercentage);
	}
	
	protected void checkMass(Kilograms expected, Kilograms actual) {
		double errorPercentage = Math.abs((actual.scalarRatio(expected) - 1) * 100);
		assertTrue(
			expected + " != " + actual + "(" + errorPercentage + "% error)",
			errorPercentage < maxErrorPercentage);
	}
	
	protected void checkVelocity(MetersPerSecond expected, MetersPerSecond actual) {
		double errorPercentage = Math.abs((actual.scalarRatio(expected) - 1) * 100);
		assertTrue(
			expected + " != " + actual + "(" + errorPercentage + "% error)",
			errorPercentage < maxErrorPercentage);
	}

}
