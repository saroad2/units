package com.units.tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.units.angle.Degrees;
import com.units.duration.Minutes;
import com.units.duration.Seconds;
import com.units.exceptions.IllegalUnitsCasting;
import com.units.length.Meters;
import com.units.length.Yards;
import com.units.speed.MetersPerSecond;

public class TestUnitsDivide {

	private void checkResult(MetersPerSecond actual, MetersPerSecond expected) {
		assertTrue(actual + " != " + expected, actual.equals(expected));
	}
	
	@Test
	public void testDivideMetersBySecondsToCreateMetersPerSecond() {
		MetersPerSecond speed = new Meters(8)
				.divide(new Seconds(2))
				.castTo(MetersPerSecond.class);
		checkResult(speed, new MetersPerSecond(4));
	}
	
	@Test
	public void testDivideYardsBySecondsToCreateMetersPerSecond() {
		MetersPerSecond speed = new Yards(8)
				.divide(new Seconds(2))
				.castTo(MetersPerSecond.class);
		checkResult(speed, new MetersPerSecond(3.6576));
	}
	
	@Test
	public void testDivideMetersByMinutesToCreateMetersPerSecond() {
		MetersPerSecond speed = new Meters(8)
				.divide(new Minutes(2))
				.castTo(MetersPerSecond.class);
		checkResult(speed, new MetersPerSecond(0.0666666666666666));
	}
	
	@Test(expected = IllegalUnitsCasting.class)
	public void testCantDivideDegreesBySecondsToCreateMetersPerSecond() {
		new Degrees(8).divide(new Seconds(2)).castTo(MetersPerSecond.class);
	}
	
	@Test(expected = IllegalUnitsCasting.class)
	public void testCantDivideMetersByDegreesToCreateMetersPerSecond() {
		new Meters(8).divide(new Degrees(2)).castTo(MetersPerSecond.class);
	}

}
