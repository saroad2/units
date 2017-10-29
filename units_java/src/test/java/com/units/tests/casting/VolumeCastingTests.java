/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.volume.*;

public class VolumeCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromCubicfeetToCubickilometers() {
		checkCastedValue(CubicFeet.one().castTo(CubicKilometers.class).value(), 2.8316846592E-11);
	}

	@Test
	public void testCastFromCubicfeetToCubicmeters() {
		checkCastedValue(CubicFeet.one().castTo(CubicMeters.class).value(), 0.028316846592);
	}

	@Test
	public void testCastFromCubicfeetToCubicyards() {
		checkCastedValue(CubicFeet.one().castTo(CubicYards.class).value(), 0.03703703703703);
	}

	@Test
	public void testCastFromCubicfeetToLiters() {
		checkCastedValue(CubicFeet.one().castTo(Liters.class).value(), 28.316846592);
	}

	@Test
	public void testCastFromCubicfeetToMilliliters() {
		checkCastedValue(CubicFeet.one().castTo(Milliliters.class).value(), 28316.846592);
	}

	@Test
	public void testCastFromCubickilometersToCubicfeet() {
		checkCastedValue(CubicKilometers.one().castTo(CubicFeet.class).value(), 3.53146667214886E10);
	}

	@Test
	public void testCastFromCubickilometersToCubicmeters() {
		checkCastedValue(CubicKilometers.one().castTo(CubicMeters.class).value(), 1.0E9);
	}

	@Test
	public void testCastFromCubickilometersToCubicyards() {
		checkCastedValue(CubicKilometers.one().castTo(CubicYards.class).value(), 1.3079506193143928E9);
	}

	@Test
	public void testCastFromCubickilometersToLiters() {
		checkCastedValue(CubicKilometers.one().castTo(Liters.class).value(), 1.0E12);
	}

	@Test
	public void testCastFromCubickilometersToMilliliters() {
		checkCastedValue(CubicKilometers.one().castTo(Milliliters.class).value(), 1.0E15);
	}

	@Test
	public void testCastFromCubicmetersToCubicfeet() {
		checkCastedValue(CubicMeters.one().castTo(CubicFeet.class).value(), 35.3146667214886);
	}

	@Test
	public void testCastFromCubicmetersToCubickilometers() {
		checkCastedValue(CubicMeters.one().castTo(CubicKilometers.class).value(), 1.0E-9);
	}

	@Test
	public void testCastFromCubicmetersToCubicyards() {
		checkCastedValue(CubicMeters.one().castTo(CubicYards.class).value(), 1.3079506193143928);
	}

	@Test
	public void testCastFromCubicmetersToLiters() {
		checkCastedValue(CubicMeters.one().castTo(Liters.class).value(), 1000.0);
	}

	@Test
	public void testCastFromCubicmetersToMilliliters() {
		checkCastedValue(CubicMeters.one().castTo(Milliliters.class).value(), 1000000.0);
	}

	@Test
	public void testCastFromCubicyardsToCubicfeet() {
		checkCastedValue(CubicYards.one().castTo(CubicFeet.class).value(), 27.0);
	}

	@Test
	public void testCastFromCubicyardsToCubickilometers() {
		checkCastedValue(CubicYards.one().castTo(CubicKilometers.class).value(), 7.64554857984E-10);
	}

	@Test
	public void testCastFromCubicyardsToCubicmeters() {
		checkCastedValue(CubicYards.one().castTo(CubicMeters.class).value(), 0.764554857984);
	}

	@Test
	public void testCastFromCubicyardsToLiters() {
		checkCastedValue(CubicYards.one().castTo(Liters.class).value(), 764.554857984);
	}

	@Test
	public void testCastFromCubicyardsToMilliliters() {
		checkCastedValue(CubicYards.one().castTo(Milliliters.class).value(), 764554.8579839998);
	}

	@Test
	public void testCastFromLitersToCubicfeet() {
		checkCastedValue(Liters.one().castTo(CubicFeet.class).value(), 0.0353146667214886);
	}

	@Test
	public void testCastFromLitersToCubickilometers() {
		checkCastedValue(Liters.one().castTo(CubicKilometers.class).value(), 1.0E-12);
	}

	@Test
	public void testCastFromLitersToCubicmeters() {
		checkCastedValue(Liters.one().castTo(CubicMeters.class).value(), 0.001);
	}

	@Test
	public void testCastFromLitersToCubicyards() {
		checkCastedValue(Liters.one().castTo(CubicYards.class).value(), 0.0013079506193143927);
	}

	@Test
	public void testCastFromLitersToMilliliters() {
		checkCastedValue(Liters.one().castTo(Milliliters.class).value(), 1000.0);
	}

	@Test
	public void testCastFromMillilitersToCubicfeet() {
		checkCastedValue(Milliliters.one().castTo(CubicFeet.class).value(), 3.53146667214886E-5);
	}

	@Test
	public void testCastFromMillilitersToCubickilometers() {
		checkCastedValue(Milliliters.one().castTo(CubicKilometers.class).value(), 1.0E-15);
	}

	@Test
	public void testCastFromMillilitersToCubicmeters() {
		checkCastedValue(Milliliters.one().castTo(CubicMeters.class).value(), 1.0E-6);
	}

	@Test
	public void testCastFromMillilitersToCubicyards() {
		checkCastedValue(Milliliters.one().castTo(CubicYards.class).value(), 1.3079506193143927E-6);
	}

	@Test
	public void testCastFromMillilitersToLiters() {
		checkCastedValue(Milliliters.one().castTo(Liters.class).value(), 0.001);
	}


}