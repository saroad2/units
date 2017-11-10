/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.mass.*;

public class MassCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromGramsToKilograms() {
		checkCastedValue(Grams.one().castTo(Kilograms.class), new Kilograms(0.001));
	}

	@Test
	public void testCastFromGramsToMilligrams() {
		checkCastedValue(Grams.one().castTo(Milligrams.class), new Milligrams(1000.0));
	}

	@Test
	public void testCastFromGramsToPounds() {
		checkCastedValue(Grams.one().castTo(Pounds.class), new Pounds(0.002204622800000002));
	}

	@Test
	public void testCastFromGramsToSolarmasses() {
		checkCastedValue(Grams.one().castTo(SolarMasses.class), new SolarMasses(5.028789821729402E-34));
	}

	@Test
	public void testCastFromGramsToTonnes() {
		checkCastedValue(Grams.one().castTo(Tonnes.class), new Tonnes(1.0E-6));
	}

	@Test
	public void testCastFromKilogramsToGrams() {
		checkCastedValue(Kilograms.one().castTo(Grams.class), new Grams(1000.0));
	}

	@Test
	public void testCastFromKilogramsToMilligrams() {
		checkCastedValue(Kilograms.one().castTo(Milligrams.class), new Milligrams(1000000.0));
	}

	@Test
	public void testCastFromKilogramsToPounds() {
		checkCastedValue(Kilograms.one().castTo(Pounds.class), new Pounds(2.204622800000002));
	}

	@Test
	public void testCastFromKilogramsToSolarmasses() {
		checkCastedValue(Kilograms.one().castTo(SolarMasses.class), new SolarMasses(5.028789821729402E-31));
	}

	@Test
	public void testCastFromKilogramsToTonnes() {
		checkCastedValue(Kilograms.one().castTo(Tonnes.class), new Tonnes(0.001));
	}

	@Test
	public void testCastFromMilligramsToGrams() {
		checkCastedValue(Milligrams.one().castTo(Grams.class), new Grams(0.001));
	}

	@Test
	public void testCastFromMilligramsToKilograms() {
		checkCastedValue(Milligrams.one().castTo(Kilograms.class), new Kilograms(1.0E-6));
	}

	@Test
	public void testCastFromMilligramsToPounds() {
		checkCastedValue(Milligrams.one().castTo(Pounds.class), new Pounds(2.204622800000002E-6));
	}

	@Test
	public void testCastFromMilligramsToSolarmasses() {
		checkCastedValue(Milligrams.one().castTo(SolarMasses.class), new SolarMasses(5.028789821729401E-37));
	}

	@Test
	public void testCastFromMilligramsToTonnes() {
		checkCastedValue(Milligrams.one().castTo(Tonnes.class), new Tonnes(1.0E-9));
	}

	@Test
	public void testCastFromPoundsToGrams() {
		checkCastedValue(Pounds.one().castTo(Grams.class), new Grams(453.592333346094));
	}

	@Test
	public void testCastFromPoundsToKilograms() {
		checkCastedValue(Pounds.one().castTo(Kilograms.class), new Kilograms(0.453592333346094));
	}

	@Test
	public void testCastFromPoundsToMilligrams() {
		checkCastedValue(Pounds.one().castTo(Milligrams.class), new Milligrams(453592.333346094));
	}

	@Test
	public void testCastFromPoundsToSolarmasses() {
		checkCastedValue(Pounds.one().castTo(SolarMasses.class), new SolarMasses(2.2810205091453275E-31));
	}

	@Test
	public void testCastFromPoundsToTonnes() {
		checkCastedValue(Pounds.one().castTo(Tonnes.class), new Tonnes(4.53592333346094E-4));
	}

	@Test
	public void testCastFromSolarmassesToGrams() {
		checkCastedValue(SolarMasses.one().castTo(Grams.class), new Grams(1.98855E33));
	}

	@Test
	public void testCastFromSolarmassesToKilograms() {
		checkCastedValue(SolarMasses.one().castTo(Kilograms.class), new Kilograms(1.98855E30));
	}

	@Test
	public void testCastFromSolarmassesToMilligrams() {
		checkCastedValue(SolarMasses.one().castTo(Milligrams.class), new Milligrams(1.9885499999999998E36));
	}

	@Test
	public void testCastFromSolarmassesToPounds() {
		checkCastedValue(SolarMasses.one().castTo(Pounds.class), new Pounds(4.3840026689400034E30));
	}

	@Test
	public void testCastFromSolarmassesToTonnes() {
		checkCastedValue(SolarMasses.one().castTo(Tonnes.class), new Tonnes(1.98855E27));
	}

	@Test
	public void testCastFromTonnesToGrams() {
		checkCastedValue(Tonnes.one().castTo(Grams.class), new Grams(1000000.0));
	}

	@Test
	public void testCastFromTonnesToKilograms() {
		checkCastedValue(Tonnes.one().castTo(Kilograms.class), new Kilograms(1000.0));
	}

	@Test
	public void testCastFromTonnesToMilligrams() {
		checkCastedValue(Tonnes.one().castTo(Milligrams.class), new Milligrams(1.0E9));
	}

	@Test
	public void testCastFromTonnesToPounds() {
		checkCastedValue(Tonnes.one().castTo(Pounds.class), new Pounds(2204.622800000002));
	}

	@Test
	public void testCastFromTonnesToSolarmasses() {
		checkCastedValue(Tonnes.one().castTo(SolarMasses.class), new SolarMasses(5.028789821729402E-28));
	}


}