/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.speed.*;

public class SpeedCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromFeetpersecondToKilometersperhour() {
		checkCastedValue(FeetPerSecond.one().castTo(KilometersPerHour.class).value(), 1.09728);
	}

	@Test
	public void testCastFromFeetpersecondToKnots() {
		checkCastedValue(FeetPerSecond.one().castTo(Knots.class).value(), 0.5924834221063782);
	}

	@Test
	public void testCastFromFeetpersecondToMeterspersecond() {
		checkCastedValue(FeetPerSecond.one().castTo(MetersPerSecond.class).value(), 0.3048);
	}

	@Test
	public void testCastFromFeetpersecondToYardspersecond() {
		checkCastedValue(FeetPerSecond.one().castTo(YardsPerSecond.class).value(), 0.3333333333333);
	}

	@Test
	public void testCastFromKilometersperhourToFeetpersecond() {
		checkCastedValue(KilometersPerHour.one().castTo(FeetPerSecond.class).value(), 0.9113444152814233);
	}

	@Test
	public void testCastFromKilometersperhourToKnots() {
		checkCastedValue(KilometersPerHour.one().castTo(Knots.class).value(), 0.5399564578834739);
	}

	@Test
	public void testCastFromKilometersperhourToMeterspersecond() {
		checkCastedValue(KilometersPerHour.one().castTo(MetersPerSecond.class).value(), 0.27777777777);
	}

	@Test
	public void testCastFromKilometersperhourToYardspersecond() {
		checkCastedValue(KilometersPerHour.one().castTo(YardsPerSecond.class).value(), 0.30378147176047443);
	}

	@Test
	public void testCastFromKnotsToFeetpersecond() {
		checkCastedValue(Knots.one().castTo(FeetPerSecond.class).value(), 1.6878109372998689);
	}

	@Test
	public void testCastFromKnotsToKilometersperhour() {
		checkCastedValue(Knots.one().castTo(KilometersPerHour.class).value(), 1.8520011852804);
	}

	@Test
	public void testCastFromKnotsToMeterspersecond() {
		checkCastedValue(Knots.one().castTo(MetersPerSecond.class).value(), 0.514444773689);
	}

	@Test
	public void testCastFromKnotsToYardspersecond() {
		checkCastedValue(Knots.one().castTo(YardsPerSecond.class).value(), 0.562603645766623);
	}

	@Test
	public void testCastFromMeterspersecondToFeetpersecond() {
		checkCastedValue(MetersPerSecond.one().castTo(FeetPerSecond.class).value(), 3.280839895013124);
	}

	@Test
	public void testCastFromMeterspersecondToKilometersperhour() {
		checkCastedValue(MetersPerSecond.one().castTo(KilometersPerHour.class).value(), 3.6);
	}

	@Test
	public void testCastFromMeterspersecondToKnots() {
		checkCastedValue(MetersPerSecond.one().castTo(Knots.class).value(), 1.943843248380506);
	}

	@Test
	public void testCastFromMeterspersecondToYardspersecond() {
		checkCastedValue(MetersPerSecond.one().castTo(YardsPerSecond.class).value(), 1.093613298337708);
	}

	@Test
	public void testCastFromYardspersecondToFeetpersecond() {
		checkCastedValue(YardsPerSecond.one().castTo(FeetPerSecond.class).value(), 3.0);
	}

	@Test
	public void testCastFromYardspersecondToKilometersperhour() {
		checkCastedValue(YardsPerSecond.one().castTo(KilometersPerHour.class).value(), 3.29184);
	}

	@Test
	public void testCastFromYardspersecondToKnots() {
		checkCastedValue(YardsPerSecond.one().castTo(Knots.class).value(), 1.7774502663191345);
	}

	@Test
	public void testCastFromYardspersecondToMeterspersecond() {
		checkCastedValue(YardsPerSecond.one().castTo(MetersPerSecond.class).value(), 0.9144);
	}


}