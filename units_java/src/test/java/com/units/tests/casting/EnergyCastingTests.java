/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.energy.*;

public class EnergyCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromCaloriesToJoules() {
		checkCastedValue(Calories.one().castTo(Joules.class).value(), 4.184);
	}

	@Test
	public void testCastFromCaloriesToKilocalories() {
		checkCastedValue(Calories.one().castTo(Kilocalories.class).value(), 0.001);
	}

	@Test
	public void testCastFromCaloriesToKilojoules() {
		checkCastedValue(Calories.one().castTo(Kilojoules.class).value(), 0.004184);
	}

	@Test
	public void testCastFromCaloriesToMegajoules() {
		checkCastedValue(Calories.one().castTo(Megajoules.class).value(), 4.184E-6);
	}

	@Test
	public void testCastFromJoulesToCalories() {
		checkCastedValue(Joules.one().castTo(Calories.class).value(), 0.2390057361376673);
	}

	@Test
	public void testCastFromJoulesToKilocalories() {
		checkCastedValue(Joules.one().castTo(Kilocalories.class).value(), 2.390057361376673E-4);
	}

	@Test
	public void testCastFromJoulesToKilojoules() {
		checkCastedValue(Joules.one().castTo(Kilojoules.class).value(), 0.001);
	}

	@Test
	public void testCastFromJoulesToMegajoules() {
		checkCastedValue(Joules.one().castTo(Megajoules.class).value(), 1.0E-6);
	}

	@Test
	public void testCastFromKilocaloriesToCalories() {
		checkCastedValue(Kilocalories.one().castTo(Calories.class).value(), 1000.0);
	}

	@Test
	public void testCastFromKilocaloriesToJoules() {
		checkCastedValue(Kilocalories.one().castTo(Joules.class).value(), 4184.0);
	}

	@Test
	public void testCastFromKilocaloriesToKilojoules() {
		checkCastedValue(Kilocalories.one().castTo(Kilojoules.class).value(), 4.184);
	}

	@Test
	public void testCastFromKilocaloriesToMegajoules() {
		checkCastedValue(Kilocalories.one().castTo(Megajoules.class).value(), 0.004184);
	}

	@Test
	public void testCastFromKilojoulesToCalories() {
		checkCastedValue(Kilojoules.one().castTo(Calories.class).value(), 239.0057361376673);
	}

	@Test
	public void testCastFromKilojoulesToJoules() {
		checkCastedValue(Kilojoules.one().castTo(Joules.class).value(), 1000.0);
	}

	@Test
	public void testCastFromKilojoulesToKilocalories() {
		checkCastedValue(Kilojoules.one().castTo(Kilocalories.class).value(), 0.2390057361376673);
	}

	@Test
	public void testCastFromKilojoulesToMegajoules() {
		checkCastedValue(Kilojoules.one().castTo(Megajoules.class).value(), 0.001);
	}

	@Test
	public void testCastFromMegajoulesToCalories() {
		checkCastedValue(Megajoules.one().castTo(Calories.class).value(), 239005.7361376673);
	}

	@Test
	public void testCastFromMegajoulesToJoules() {
		checkCastedValue(Megajoules.one().castTo(Joules.class).value(), 1000000.0);
	}

	@Test
	public void testCastFromMegajoulesToKilocalories() {
		checkCastedValue(Megajoules.one().castTo(Kilocalories.class).value(), 239.0057361376673);
	}

	@Test
	public void testCastFromMegajoulesToKilojoules() {
		checkCastedValue(Megajoules.one().castTo(Kilojoules.class).value(), 1000.0);
	}


}