/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.mass.*;

public class MassCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromGramsToKilograms() {
		checkCastedValue(Kilograms.castFrom(Grams.one()).value(), 0.001);
	}

	@Test
	public void testCastFromGramsToMilligrams() {
		checkCastedValue(Milligrams.castFrom(Grams.one()).value(), 1000.0);
	}

	@Test
	public void testCastFromGramsToPounds() {
		checkCastedValue(Pounds.castFrom(Grams.one()).value(), 0.002204622800000002);
	}

	@Test
	public void testCastFromGramsToTonnes() {
		checkCastedValue(Tonnes.castFrom(Grams.one()).value(), 1.0E-6);
	}

	@Test
	public void testCastFromKilogramsToGrams() {
		checkCastedValue(Grams.castFrom(Kilograms.one()).value(), 1000.0);
	}

	@Test
	public void testCastFromKilogramsToMilligrams() {
		checkCastedValue(Milligrams.castFrom(Kilograms.one()).value(), 1000000.0);
	}

	@Test
	public void testCastFromKilogramsToPounds() {
		checkCastedValue(Pounds.castFrom(Kilograms.one()).value(), 2.204622800000002);
	}

	@Test
	public void testCastFromKilogramsToTonnes() {
		checkCastedValue(Tonnes.castFrom(Kilograms.one()).value(), 0.001);
	}

	@Test
	public void testCastFromMilligramsToGrams() {
		checkCastedValue(Grams.castFrom(Milligrams.one()).value(), 0.001);
	}

	@Test
	public void testCastFromMilligramsToKilograms() {
		checkCastedValue(Kilograms.castFrom(Milligrams.one()).value(), 1.0E-6);
	}

	@Test
	public void testCastFromMilligramsToPounds() {
		checkCastedValue(Pounds.castFrom(Milligrams.one()).value(), 2.204622800000002E-6);
	}

	@Test
	public void testCastFromMilligramsToTonnes() {
		checkCastedValue(Tonnes.castFrom(Milligrams.one()).value(), 1.0E-9);
	}

	@Test
	public void testCastFromPoundsToGrams() {
		checkCastedValue(Grams.castFrom(Pounds.one()).value(), 453.592333346094);
	}

	@Test
	public void testCastFromPoundsToKilograms() {
		checkCastedValue(Kilograms.castFrom(Pounds.one()).value(), 0.453592333346094);
	}

	@Test
	public void testCastFromPoundsToMilligrams() {
		checkCastedValue(Milligrams.castFrom(Pounds.one()).value(), 453592.333346094);
	}

	@Test
	public void testCastFromPoundsToTonnes() {
		checkCastedValue(Tonnes.castFrom(Pounds.one()).value(), 4.53592333346094E-4);
	}

	@Test
	public void testCastFromTonnesToGrams() {
		checkCastedValue(Grams.castFrom(Tonnes.one()).value(), 1000000.0);
	}

	@Test
	public void testCastFromTonnesToKilograms() {
		checkCastedValue(Kilograms.castFrom(Tonnes.one()).value(), 1000.0);
	}

	@Test
	public void testCastFromTonnesToMilligrams() {
		checkCastedValue(Milligrams.castFrom(Tonnes.one()).value(), 1.0E9);
	}

	@Test
	public void testCastFromTonnesToPounds() {
		checkCastedValue(Pounds.castFrom(Tonnes.one()).value(), 2204.622800000002);
	}


}