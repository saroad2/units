/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.angle.*;

public class AngleCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromDegreesToMils() {
		checkCastedValue(Degrees.one().castTo(Mils.class).value(), 17.7777777777777);
	}

	@Test
	public void testCastFromDegreesToRadians() {
		checkCastedValue(Degrees.one().castTo(Radians.class).value(), 0.017453292519937);
	}

	@Test
	public void testCastFromMilsToDegrees() {
		checkCastedValue(Mils.one().castTo(Degrees.class).value(), 0.05625);
	}

	@Test
	public void testCastFromMilsToRadians() {
		checkCastedValue(Mils.one().castTo(Radians.class).value(), 9.8174770424E-4);
	}

	@Test
	public void testCastFromRadiansToDegrees() {
		checkCastedValue(Radians.one().castTo(Degrees.class).value(), 57.2957795131);
	}

	@Test
	public void testCastFromRadiansToMils() {
		checkCastedValue(Radians.one().castTo(Mils.class).value(), 1018.59163578844);
	}


}