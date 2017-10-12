/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.frequency.*;

public class FrequencyCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromHertzToKilohertz() {
		checkCastedValue(Kilohertz.castFrom(Hertz.one()).value(), 0.001);
	}

	@Test
	public void testCastFromHertzToMegahertz() {
		checkCastedValue(Megahertz.castFrom(Hertz.one()).value(), 1.0E-6);
	}

	@Test
	public void testCastFromKilohertzToHertz() {
		checkCastedValue(Hertz.castFrom(Kilohertz.one()).value(), 1000.0);
	}

	@Test
	public void testCastFromKilohertzToMegahertz() {
		checkCastedValue(Megahertz.castFrom(Kilohertz.one()).value(), 0.001);
	}

	@Test
	public void testCastFromMegahertzToHertz() {
		checkCastedValue(Hertz.castFrom(Megahertz.one()).value(), 1000000.0);
	}

	@Test
	public void testCastFromMegahertzToKilohertz() {
		checkCastedValue(Kilohertz.castFrom(Megahertz.one()).value(), 1000.0);
	}


}