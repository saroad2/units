package com.units.tests;

import org.junit.Test;

import com.units.area.Dunams;
import com.units.exceptions.IllegalUnitsCasting;
import com.units.length.Kilometers;
import com.units.length.Meters;
import com.units.volume.Liters;

public class TestUnitsPow extends OperationTestSuite{
	
	@Test
	public void testMetersPowerOf1() {
		checkResult(
				new Meters(5).pow(1).castTo(Meters.class),
				new Meters(5));
	}

	@Test
	public void testKilmetersPowerOf2() {
		checkResult(
				new Kilometers(5).pow(2).castTo(Dunams.class),
				new Dunams(25000));
	}

	@Test
	public void testKilmetersSquare() {
		checkResult(
				new Kilometers(5).sqr().castTo(Dunams.class),
				new Dunams(25000));
	}

	@Test
	public void testMetersPowerOf3() {
		checkResult(
				new Meters(5).pow(3).castTo(Liters.class),
				new Liters(125000));
	}

	@Test
	public void testMetersCube() {
		checkResult(
				new Meters(5).cube().castTo(Liters.class),
				new Liters(125000));
	}

	@Test(expected = IllegalUnitsCasting.class)
	public void testMetersPow2FailedCasting() {
		new Meters(3).pow(2).castTo(Meters.class);
	}

	@Test(expected = IllegalUnitsCasting.class)
	public void testMetersSquareFailedCasting() {
		new Meters(3).sqr().castTo(Meters.class);
	}

	@Test(expected = IllegalUnitsCasting.class)
	public void testMetersPow3FailedCasting() {
		new Meters(3).pow(3).castTo(Meters.class);
	}

	@Test(expected = IllegalUnitsCasting.class)
	public void testMetersCubeFailedCasting() {
		new Meters(3).cube().castTo(Meters.class);
	}

}
