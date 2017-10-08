/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.speed.*;

public class SpeedCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromFeetpersecondToKilometersperhour() {
		checkCastedValue(KilometersPerHour.castFrom(FeetPerSecond.one()).value(), 1.09728);
	}

	@Test
	public void testCastFromFeetpersecondToKnots() {
		checkCastedValue(Knots.castFrom(FeetPerSecond.one()).value(), 0.5924834221063782);
	}

	@Test
	public void testCastFromFeetpersecondToMeterspersecond() {
		checkCastedValue(MetersPerSecond.castFrom(FeetPerSecond.one()).value(), 0.3048);
	}

	@Test
	public void testCastFromFeetpersecondToYardspersecond() {
		checkCastedValue(YardsPerSecond.castFrom(FeetPerSecond.one()).value(), 0.3333333333333);
	}

	@Test
	public void testCastFromKilometersperhourToFeetpersecond() {
		checkCastedValue(FeetPerSecond.castFrom(KilometersPerHour.one()).value(), 0.9113444152814233);
	}

	@Test
	public void testCastFromKilometersperhourToKnots() {
		checkCastedValue(Knots.castFrom(KilometersPerHour.one()).value(), 0.5399564578834739);
	}

	@Test
	public void testCastFromKilometersperhourToMeterspersecond() {
		checkCastedValue(MetersPerSecond.castFrom(KilometersPerHour.one()).value(), 0.27777777777);
	}

	@Test
	public void testCastFromKilometersperhourToYardspersecond() {
		checkCastedValue(YardsPerSecond.castFrom(KilometersPerHour.one()).value(), 0.30378147176047443);
	}

	@Test
	public void testCastFromKnotsToFeetpersecond() {
		checkCastedValue(FeetPerSecond.castFrom(Knots.one()).value(), 1.6878109372998689);
	}

	@Test
	public void testCastFromKnotsToKilometersperhour() {
		checkCastedValue(KilometersPerHour.castFrom(Knots.one()).value(), 1.8520011852804);
	}

	@Test
	public void testCastFromKnotsToMeterspersecond() {
		checkCastedValue(MetersPerSecond.castFrom(Knots.one()).value(), 0.514444773689);
	}

	@Test
	public void testCastFromKnotsToYardspersecond() {
		checkCastedValue(YardsPerSecond.castFrom(Knots.one()).value(), 0.562603645766623);
	}

	@Test
	public void testCastFromMeterspersecondToFeetpersecond() {
		checkCastedValue(FeetPerSecond.castFrom(MetersPerSecond.one()).value(), 3.280839895013124);
	}

	@Test
	public void testCastFromMeterspersecondToKilometersperhour() {
		checkCastedValue(KilometersPerHour.castFrom(MetersPerSecond.one()).value(), 3.6);
	}

	@Test
	public void testCastFromMeterspersecondToKnots() {
		checkCastedValue(Knots.castFrom(MetersPerSecond.one()).value(), 1.943843248380506);
	}

	@Test
	public void testCastFromMeterspersecondToYardspersecond() {
		checkCastedValue(YardsPerSecond.castFrom(MetersPerSecond.one()).value(), 1.093613298337708);
	}

	@Test
	public void testCastFromYardspersecondToFeetpersecond() {
		checkCastedValue(FeetPerSecond.castFrom(YardsPerSecond.one()).value(), 3.0);
	}

	@Test
	public void testCastFromYardspersecondToKilometersperhour() {
		checkCastedValue(KilometersPerHour.castFrom(YardsPerSecond.one()).value(), 3.29184);
	}

	@Test
	public void testCastFromYardspersecondToKnots() {
		checkCastedValue(Knots.castFrom(YardsPerSecond.one()).value(), 1.7774502663191345);
	}

	@Test
	public void testCastFromYardspersecondToMeterspersecond() {
		checkCastedValue(MetersPerSecond.castFrom(YardsPerSecond.one()).value(), 0.9144);
	}


}