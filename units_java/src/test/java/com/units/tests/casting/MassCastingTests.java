/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.mass.*;

public class MassCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromGramsToKilograms() {
		checkCastedValue(Grams.one().castTo(Kilograms.class).value(), 0.001);
	}

	@Test
	public void testCastFromGramsToMilligrams() {
		checkCastedValue(Grams.one().castTo(Milligrams.class).value(), 1000.0);
	}

	@Test
	public void testCastFromGramsToPounds() {
		checkCastedValue(Grams.one().castTo(Pounds.class).value(), 0.002204622800000002);
	}

	@Test
	public void testCastFromGramsToTonnes() {
		checkCastedValue(Grams.one().castTo(Tonnes.class).value(), 1.0E-6);
	}

	@Test
	public void testCastFromKilogramsToGrams() {
		checkCastedValue(Kilograms.one().castTo(Grams.class).value(), 1000.0);
	}

	@Test
	public void testCastFromKilogramsToMilligrams() {
		checkCastedValue(Kilograms.one().castTo(Milligrams.class).value(), 1000000.0);
	}

	@Test
	public void testCastFromKilogramsToPounds() {
		checkCastedValue(Kilograms.one().castTo(Pounds.class).value(), 2.204622800000002);
	}

	@Test
	public void testCastFromKilogramsToTonnes() {
		checkCastedValue(Kilograms.one().castTo(Tonnes.class).value(), 0.001);
	}

	@Test
	public void testCastFromMilligramsToGrams() {
		checkCastedValue(Milligrams.one().castTo(Grams.class).value(), 0.001);
	}

	@Test
	public void testCastFromMilligramsToKilograms() {
		checkCastedValue(Milligrams.one().castTo(Kilograms.class).value(), 1.0E-6);
	}

	@Test
	public void testCastFromMilligramsToPounds() {
		checkCastedValue(Milligrams.one().castTo(Pounds.class).value(), 2.204622800000002E-6);
	}

	@Test
	public void testCastFromMilligramsToTonnes() {
		checkCastedValue(Milligrams.one().castTo(Tonnes.class).value(), 1.0E-9);
	}

	@Test
	public void testCastFromPoundsToGrams() {
		checkCastedValue(Pounds.one().castTo(Grams.class).value(), 453.592333346094);
	}

	@Test
	public void testCastFromPoundsToKilograms() {
		checkCastedValue(Pounds.one().castTo(Kilograms.class).value(), 0.453592333346094);
	}

	@Test
	public void testCastFromPoundsToMilligrams() {
		checkCastedValue(Pounds.one().castTo(Milligrams.class).value(), 453592.333346094);
	}

	@Test
	public void testCastFromPoundsToTonnes() {
		checkCastedValue(Pounds.one().castTo(Tonnes.class).value(), 4.53592333346094E-4);
	}

	@Test
	public void testCastFromTonnesToGrams() {
		checkCastedValue(Tonnes.one().castTo(Grams.class).value(), 1000000.0);
	}

	@Test
	public void testCastFromTonnesToKilograms() {
		checkCastedValue(Tonnes.one().castTo(Kilograms.class).value(), 1000.0);
	}

	@Test
	public void testCastFromTonnesToMilligrams() {
		checkCastedValue(Tonnes.one().castTo(Milligrams.class).value(), 1.0E9);
	}

	@Test
	public void testCastFromTonnesToPounds() {
		checkCastedValue(Tonnes.one().castTo(Pounds.class).value(), 2204.622800000002);
	}


}