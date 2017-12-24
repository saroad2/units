package com.units.tests.constants;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static com.units.constants.Wgs84.*;

public class TestWGS84 {

	static final double error = 1e-10;
	
	private void assertAlmostEqual(double expected, double actual) {
		assertTrue(
				expected + " != " + actual,
			Math.abs(expected - actual) < error);
	}
	
	@Test
	public void testFlatenningToAxisesRelation() {
		double expected = flattening;
		double actual = 1 - semiMinorAxis.divide(semiMajorAxis).value();
		assertAlmostEqual(expected, actual);
	}
	
	@Test
	public void testFirstEccenticityToAxisesRelation() {
		double expected = firstEccentricity;
		double actual = Math.sqrt(1 - Math.pow(semiMinorAxis.divide(semiMajorAxis).value(), 2));
		assertAlmostEqual(expected, actual);
	}
	
	@Test
	public void testFirstEccenticityToFlatteningRelation() {
		double expected = firstEccentricity;
		double actual = Math.sqrt(flattening * (2 - flattening));
		assertAlmostEqual(expected, actual);
	}
	
	@Test
	public void testSecondEccenticityToAxisesRelation() {
		double expected = secondEccentricity;
		double actual = Math.sqrt(Math.pow(semiMajorAxis.divide(semiMinorAxis).value(), 2) - 1);
		assertAlmostEqual(expected, actual);
	}
	
	@Test
	public void testSecondEccenticityToFlatteningRelation() {
		double expected = firstEccentricity;
		double actual = secondEccentricity * (1 - flattening);
		assertAlmostEqual(expected, actual);
	}

}
