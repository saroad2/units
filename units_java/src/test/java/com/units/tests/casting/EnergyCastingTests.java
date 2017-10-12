/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.energy.*;

public class EnergyCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromCaloriesToJoules() {
		checkCastedValue(Joules.castFrom(Calories.one()).value(), 4.184);
	}

	@Test
	public void testCastFromCaloriesToKilocalories() {
		checkCastedValue(Kilocalories.castFrom(Calories.one()).value(), 0.001);
	}

	@Test
	public void testCastFromCaloriesToKilojoules() {
		checkCastedValue(Kilojoules.castFrom(Calories.one()).value(), 0.004184);
	}

	@Test
	public void testCastFromCaloriesToMegajoules() {
		checkCastedValue(Megajoules.castFrom(Calories.one()).value(), 4.184E-6);
	}

	@Test
	public void testCastFromJoulesToCalories() {
		checkCastedValue(Calories.castFrom(Joules.one()).value(), 0.2390057361376673);
	}

	@Test
	public void testCastFromJoulesToKilocalories() {
		checkCastedValue(Kilocalories.castFrom(Joules.one()).value(), 2.390057361376673E-4);
	}

	@Test
	public void testCastFromJoulesToKilojoules() {
		checkCastedValue(Kilojoules.castFrom(Joules.one()).value(), 0.001);
	}

	@Test
	public void testCastFromJoulesToMegajoules() {
		checkCastedValue(Megajoules.castFrom(Joules.one()).value(), 1.0E-6);
	}

	@Test
	public void testCastFromKilocaloriesToCalories() {
		checkCastedValue(Calories.castFrom(Kilocalories.one()).value(), 1000.0);
	}

	@Test
	public void testCastFromKilocaloriesToJoules() {
		checkCastedValue(Joules.castFrom(Kilocalories.one()).value(), 4184.0);
	}

	@Test
	public void testCastFromKilocaloriesToKilojoules() {
		checkCastedValue(Kilojoules.castFrom(Kilocalories.one()).value(), 4.184);
	}

	@Test
	public void testCastFromKilocaloriesToMegajoules() {
		checkCastedValue(Megajoules.castFrom(Kilocalories.one()).value(), 0.004184);
	}

	@Test
	public void testCastFromKilojoulesToCalories() {
		checkCastedValue(Calories.castFrom(Kilojoules.one()).value(), 239.0057361376673);
	}

	@Test
	public void testCastFromKilojoulesToJoules() {
		checkCastedValue(Joules.castFrom(Kilojoules.one()).value(), 1000.0);
	}

	@Test
	public void testCastFromKilojoulesToKilocalories() {
		checkCastedValue(Kilocalories.castFrom(Kilojoules.one()).value(), 0.2390057361376673);
	}

	@Test
	public void testCastFromKilojoulesToMegajoules() {
		checkCastedValue(Megajoules.castFrom(Kilojoules.one()).value(), 0.001);
	}

	@Test
	public void testCastFromMegajoulesToCalories() {
		checkCastedValue(Calories.castFrom(Megajoules.one()).value(), 239005.7361376673);
	}

	@Test
	public void testCastFromMegajoulesToJoules() {
		checkCastedValue(Joules.castFrom(Megajoules.one()).value(), 1000000.0);
	}

	@Test
	public void testCastFromMegajoulesToKilocalories() {
		checkCastedValue(Kilocalories.castFrom(Megajoules.one()).value(), 239.0057361376673);
	}

	@Test
	public void testCastFromMegajoulesToKilojoules() {
		checkCastedValue(Kilojoules.castFrom(Megajoules.one()).value(), 1000.0);
	}


}