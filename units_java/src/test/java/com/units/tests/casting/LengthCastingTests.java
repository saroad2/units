package com.units.tests.casting;

import org.junit.Test;

import com.units.length.Inches;
import com.units.length.Meters;

public class LengthCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromMetersToInches() {
		checkCastedValue(Inches.castFrom(Meters.one()).value(), 39.37007874015748);
	}

	@Test
	public void testCastFromInchsToMeters() {
		checkCastedValue(Meters.castFrom(Inches.one()).value(), 0.0254);
	}
}
