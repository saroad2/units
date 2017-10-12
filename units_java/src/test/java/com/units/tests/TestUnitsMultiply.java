package com.units.tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.units.angle.Degrees;
import com.units.duration.Seconds;
import com.units.length.Meters;
import com.units.speed.Knots;
import com.units.speed.MetersPerSecond;

public class TestUnitsMultiply {

	private void checkResult(Meters actual, Meters expected) {
		assertTrue(
			actual + " != " + expected,
			actual.almostEqualsValue(expected.value()));
	}
	
	@Test
	public void testMultiplySecondsByMetersPerSecondsToCreateMeters() {
		checkResult(
			Meters.multiply(new Seconds(3), new MetersPerSecond(5)),
			new Meters(15));
	}
	
	@Test
	public void testMultiplyMetersPerSecondsBySecondsToCreateMeters() {
		checkResult(
			Meters.multiply(new MetersPerSecond(5), new Seconds(3)),
			new Meters(15));
	}

	@Test
	public void testMultiplyKnotsBySecondsToCreateMeters() {
		checkResult(
			Meters.multiply(new Knots(5), new Seconds(3)),
			new Meters(7.716671605335));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMultiplyDegreesBySecondsToCreateMetersThrowsException() {
		Meters.multiply(new Degrees(5), new Seconds(3));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMultiplyKnotsByDegreesToCreateMetersThrowsException() {
		Meters.multiply(new Knots(5), new Degrees(3));
	}
}
