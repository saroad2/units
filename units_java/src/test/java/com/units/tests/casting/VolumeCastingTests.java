/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.volume.*;

public class VolumeCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromCubicfeetToCubickilometers() {
		checkCastedValue(CubicKilometers.castFrom(CubicFeet.one()).value(), 2.8316846592E-11);
	}

	@Test
	public void testCastFromCubicfeetToCubicmeters() {
		checkCastedValue(CubicMeters.castFrom(CubicFeet.one()).value(), 0.028316846592);
	}

	@Test
	public void testCastFromCubicfeetToCubicyards() {
		checkCastedValue(CubicYards.castFrom(CubicFeet.one()).value(), 0.03703703703703);
	}

	@Test
	public void testCastFromCubicfeetToLiters() {
		checkCastedValue(Liters.castFrom(CubicFeet.one()).value(), 28.316846592);
	}

	@Test
	public void testCastFromCubicfeetToMilliliters() {
		checkCastedValue(Milliliters.castFrom(CubicFeet.one()).value(), 28316.846592);
	}

	@Test
	public void testCastFromCubickilometersToCubicfeet() {
		checkCastedValue(CubicFeet.castFrom(CubicKilometers.one()).value(), 3.53146667214886E10);
	}

	@Test
	public void testCastFromCubickilometersToCubicmeters() {
		checkCastedValue(CubicMeters.castFrom(CubicKilometers.one()).value(), 1.0E9);
	}

	@Test
	public void testCastFromCubickilometersToCubicyards() {
		checkCastedValue(CubicYards.castFrom(CubicKilometers.one()).value(), 1.3079506193143928E9);
	}

	@Test
	public void testCastFromCubickilometersToLiters() {
		checkCastedValue(Liters.castFrom(CubicKilometers.one()).value(), 1.0E12);
	}

	@Test
	public void testCastFromCubickilometersToMilliliters() {
		checkCastedValue(Milliliters.castFrom(CubicKilometers.one()).value(), 1.0E15);
	}

	@Test
	public void testCastFromCubicmetersToCubicfeet() {
		checkCastedValue(CubicFeet.castFrom(CubicMeters.one()).value(), 35.3146667214886);
	}

	@Test
	public void testCastFromCubicmetersToCubickilometers() {
		checkCastedValue(CubicKilometers.castFrom(CubicMeters.one()).value(), 1.0E-9);
	}

	@Test
	public void testCastFromCubicmetersToCubicyards() {
		checkCastedValue(CubicYards.castFrom(CubicMeters.one()).value(), 1.3079506193143928);
	}

	@Test
	public void testCastFromCubicmetersToLiters() {
		checkCastedValue(Liters.castFrom(CubicMeters.one()).value(), 1000.0);
	}

	@Test
	public void testCastFromCubicmetersToMilliliters() {
		checkCastedValue(Milliliters.castFrom(CubicMeters.one()).value(), 1000000.0);
	}

	@Test
	public void testCastFromCubicyardsToCubicfeet() {
		checkCastedValue(CubicFeet.castFrom(CubicYards.one()).value(), 27.0);
	}

	@Test
	public void testCastFromCubicyardsToCubickilometers() {
		checkCastedValue(CubicKilometers.castFrom(CubicYards.one()).value(), 7.64554857984E-10);
	}

	@Test
	public void testCastFromCubicyardsToCubicmeters() {
		checkCastedValue(CubicMeters.castFrom(CubicYards.one()).value(), 0.764554857984);
	}

	@Test
	public void testCastFromCubicyardsToLiters() {
		checkCastedValue(Liters.castFrom(CubicYards.one()).value(), 764.554857984);
	}

	@Test
	public void testCastFromCubicyardsToMilliliters() {
		checkCastedValue(Milliliters.castFrom(CubicYards.one()).value(), 764554.8579839998);
	}

	@Test
	public void testCastFromLitersToCubicfeet() {
		checkCastedValue(CubicFeet.castFrom(Liters.one()).value(), 0.0353146667214886);
	}

	@Test
	public void testCastFromLitersToCubickilometers() {
		checkCastedValue(CubicKilometers.castFrom(Liters.one()).value(), 1.0E-12);
	}

	@Test
	public void testCastFromLitersToCubicmeters() {
		checkCastedValue(CubicMeters.castFrom(Liters.one()).value(), 0.001);
	}

	@Test
	public void testCastFromLitersToCubicyards() {
		checkCastedValue(CubicYards.castFrom(Liters.one()).value(), 0.0013079506193143927);
	}

	@Test
	public void testCastFromLitersToMilliliters() {
		checkCastedValue(Milliliters.castFrom(Liters.one()).value(), 1000.0);
	}

	@Test
	public void testCastFromMillilitersToCubicfeet() {
		checkCastedValue(CubicFeet.castFrom(Milliliters.one()).value(), 3.53146667214886E-5);
	}

	@Test
	public void testCastFromMillilitersToCubickilometers() {
		checkCastedValue(CubicKilometers.castFrom(Milliliters.one()).value(), 1.0E-15);
	}

	@Test
	public void testCastFromMillilitersToCubicmeters() {
		checkCastedValue(CubicMeters.castFrom(Milliliters.one()).value(), 1.0E-6);
	}

	@Test
	public void testCastFromMillilitersToCubicyards() {
		checkCastedValue(CubicYards.castFrom(Milliliters.one()).value(), 1.3079506193143927E-6);
	}

	@Test
	public void testCastFromMillilitersToLiters() {
		checkCastedValue(Liters.castFrom(Milliliters.one()).value(), 0.001);
	}


}