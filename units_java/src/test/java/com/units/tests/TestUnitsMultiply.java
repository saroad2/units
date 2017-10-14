package com.units.tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.units.angle.Degrees;
import com.units.duration.Seconds;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.length.Meters;
import com.units.length.Yards;
import com.units.speed.Knots;
import com.units.speed.MetersPerSecond;
import com.units.volume.CubicMeters;

public class TestUnitsMultiply {

	private void checkResult(Meters actual, Meters expected) {
		assertTrue(
			actual + " != " + expected,
			actual.almostEqualsValue(expected.value()));
	}
	
	private void checkResult(CubicMeters actual, CubicMeters expected) {
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

	@Test(expected = IllegalUnitsMultiplication.class)
	public void testMultiplyDegreesBySecondsToCreateMetersThrowsException() {
		Meters.multiply(new Degrees(5), new Seconds(3));
	}

	@Test(expected = IllegalUnitsMultiplication.class)
	public void testMultiplyKnotsByDegreesToCreateMetersThrowsException() {
		Meters.multiply(new Knots(5), new Degrees(3));
	}
	
	@Test
	public void testMultiplyMetersByMetersByMetersToCreateCubicMeters() {
		checkResult(CubicMeters.multiply(
						new Meters(2),
						new Meters(3),
						new Meters(5)),
					new CubicMeters(30));
	}

	@Test
	public void testMultiplyMetersByMetersByYardsToCreateCubicMeters() {
		checkResult(CubicMeters.multiply(
						new Meters(2),
						new Meters(3),
						new Yards(5)),
					new CubicMeters(27.432));
	}

	@Test(expected = IllegalUnitsMultiplication.class)
	public void 
		testMultiplyMetersByDegreesByYardsToCreateCubicMetersThrowsException() {
		CubicMeters.multiply(new Meters(2), new Degrees(3), new Yards(5));
	}
}
