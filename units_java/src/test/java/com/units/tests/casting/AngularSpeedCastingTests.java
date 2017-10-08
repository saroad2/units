/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.angular_speed.*;

public class AngularSpeedCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromDegreespersecondToMilspersecond() {
		checkCastedValue(MilsPerSecond.castFrom(DegreesPerSecond.one()).value(), 17.7777777777777);
	}

	@Test
	public void testCastFromDegreespersecondToRadianspersecond() {
		checkCastedValue(RadiansPerSecond.castFrom(DegreesPerSecond.one()).value(), 0.017453292519937);
	}

	@Test
	public void testCastFromMilspersecondToDegreespersecond() {
		checkCastedValue(DegreesPerSecond.castFrom(MilsPerSecond.one()).value(), 0.05625);
	}

	@Test
	public void testCastFromMilspersecondToRadianspersecond() {
		checkCastedValue(RadiansPerSecond.castFrom(MilsPerSecond.one()).value(), 9.8174770424E-4);
	}

	@Test
	public void testCastFromRadianspersecondToDegreespersecond() {
		checkCastedValue(DegreesPerSecond.castFrom(RadiansPerSecond.one()).value(), 57.2957795131);
	}

	@Test
	public void testCastFromRadianspersecondToMilspersecond() {
		checkCastedValue(MilsPerSecond.castFrom(RadiansPerSecond.one()).value(), 1018.59163578844);
	}


}