package com.units.tests.casting;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import com.units.length.Inches;
import com.units.length.Meters;

public class LengthCastingTests {

	@Test
	public void testCastFromMetersToInches() {
		double originalValue = 4;
		double castingValue = 0.1016;
		Meters unit = Meters.castFrom(new Inches(originalValue));
		
		assertTrue("value after casting is " + unit.value() + " instead of " + castingValue,
				unit.value() == castingValue);
	}

	@Test
	public void testCastFromInchsToMeters() {
		double originalValue = 4;
		double castingValue = 157.48031496062993;
		Inches unit = Inches.castFrom(new Meters(originalValue));
		
		assertTrue("value after casting is " + unit.value() + " instead of " + castingValue,
				unit.value() == castingValue);
	}
}
