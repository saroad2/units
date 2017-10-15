package com.units.tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.units.angle.Degrees;
import com.units.duration.Seconds;
import com.units.exceptions.IllegalUnitsCasting;
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
		Meters length = new Seconds(3)
				.multiply(new MetersPerSecond(5))
				.castTo(Meters.class);
		checkResult(length, new Meters(15));
	}
	
	@Test
	public void testMultiplyMetersPerSecondsBySecondsToCreateMeters() {
		Meters length = new MetersPerSecond(3)
				.multiply(new Seconds(5))
				.castTo(Meters.class);
		checkResult(length, new Meters(15));
	}

	@Test
	public void testMultiplyKnotsBySecondsToCreateMeters() {
		Meters length = new Seconds(3)
				.multiply(new Knots(5))
				.castTo(Meters.class);
		checkResult(length, new Meters(7.716671605335));
	}

	@Test(expected = IllegalUnitsCasting.class)
	public void testMultiplyDegreesBySecondsToCreateMetersThrowsException() {
		new Degrees(5).multiply(new Seconds(3)).castTo(Meters.class);
	}

	@Test(expected = IllegalUnitsCasting.class)
	public void testMultiplyKnotsByDegreesToCreateMetersThrowsException() {
		new Knots(5).multiply(new Degrees(3)).castTo(Meters.class);
	}
}
