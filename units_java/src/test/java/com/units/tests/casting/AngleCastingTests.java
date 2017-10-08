/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.angle.*;

public class AngleCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromDegreesToMils() {
		checkCastedValue(Mils.castFrom(Degrees.one()).value(), 17.7777777777777);
	}

	@Test
	public void testCastFromDegreesToRadians() {
		checkCastedValue(Radians.castFrom(Degrees.one()).value(), 0.017453292519937);
	}

	@Test
	public void testCastFromMilsToDegrees() {
		checkCastedValue(Degrees.castFrom(Mils.one()).value(), 0.05625);
	}

	@Test
	public void testCastFromMilsToRadians() {
		checkCastedValue(Radians.castFrom(Mils.one()).value(), 9.8174770424E-4);
	}

	@Test
	public void testCastFromRadiansToDegrees() {
		checkCastedValue(Degrees.castFrom(Radians.one()).value(), 57.2957795131);
	}

	@Test
	public void testCastFromRadiansToMils() {
		checkCastedValue(Mils.castFrom(Radians.one()).value(), 1018.59163578844);
	}


}